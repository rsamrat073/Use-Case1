/**
 * 
 */
package com.target.model;

import org.springframework.data.cassandra.mapping.Table;

/**
 * @author sroy28
 *
 */
@Table("Product")
public class Product extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -774502971405460416L;
	private String productName;
	private String productDescription;
	private int productPrice;
	private String productModelNumber;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductModelNumber() {
		return productModelNumber;
	}

	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDescription=" + productDescription + ", productPrice="
				+ productPrice + ", productModelNumber=" + productModelNumber + "]";
	}

}
