package com.myprojects.myfinances.model;

public class Category {
	
	public String name;
	Category parent;
	
	public Category(String name, Category parent) {
		super();
		this.name = name;
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	

}
