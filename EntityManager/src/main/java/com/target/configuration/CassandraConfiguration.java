/**
 * 
 */
package com.target.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.convert.CassandraConverter;
import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;

/**
 * @author sroy28
 *
 */
@Configuration
@PropertySource(value = { "classpath:cassandra.properties" })
public class CassandraConfiguration {

	
	private static final String KEYSPACE = "cassandra.keyspace";
	
	private static final String CONTACTPOINTS = "cassandra.seeds";
	
	private static final String PORT = "cassandra.port";

	@Autowired
	private Environment environment;

	public CassandraConfiguration() {
       
    }

	private String getKeyspaceName() {
		return environment.getProperty(KEYSPACE);
	}

	private String getContactPoints() {
		return environment.getProperty(CONTACTPOINTS);
	}

	private int getPortNumber() {
		return Integer.parseInt(environment.getProperty(PORT));
	}

	@Bean
	public CassandraClusterFactoryBean cluster() {
		CassandraClusterFactoryBean cluster = new CassandraClusterFactoryBean();
		cluster.setContactPoints(getContactPoints());
		cluster.setPort(getPortNumber());
		return cluster;
	}

	@Bean
	public CassandraMappingContext mappingContext() {
		return new BasicCassandraMappingContext();
	}

	@Bean
	public CassandraConverter converter() {
		return new MappingCassandraConverter(mappingContext());
	}

	@Bean
	public CassandraSessionFactoryBean session() throws Exception {
		CassandraSessionFactoryBean cassandraSessionFactoryBean = new CassandraSessionFactoryBean();
		cassandraSessionFactoryBean.setCluster(cluster().getObject());
		cassandraSessionFactoryBean.setKeyspaceName(getKeyspaceName());
		cassandraSessionFactoryBean.setConverter(converter());
		cassandraSessionFactoryBean.setSchemaAction(SchemaAction.NONE);
		return cassandraSessionFactoryBean;
	}

	@Bean
	public CassandraOperations cassandraTemplate() throws Exception {
		return new CassandraTemplate(session().getObject());
	}
}
