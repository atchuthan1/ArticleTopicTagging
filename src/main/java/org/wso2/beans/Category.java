package org.wso2.beans;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName(value="Category")
public class Category {
	private int category_id;
	private String category_name;
	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
}
