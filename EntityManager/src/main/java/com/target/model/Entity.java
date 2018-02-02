/**
 * 
 */
package com.target.model;

import java.io.Serializable;

import org.springframework.data.cassandra.mapping.PrimaryKey;

/**
 * @author sroy28
 *
 */
public class Entity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3023639074385038992L;
	@PrimaryKey
	private int id;

	public Entity() {
		// TODO Auto-generated constructor stub
	}

	public Entity(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + "]";
	}

}
