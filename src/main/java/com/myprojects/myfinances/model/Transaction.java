package com.myprojects.myfinances.model;

import java.time.LocalDate;

public class Transaction {
	Category category;
	String type;
	LocalDate date;
	Double value;
	boolean Realised;
	
	public Transaction(Category category, String type, LocalDate date, Double value, boolean realised) {
		super();
		this.category = category;
		this.type = type;
		this.date = date;
		this.value = value;
		Realised = realised;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public boolean isRealised() {
		return Realised;
	}

	public void setRealised(boolean realised) {
		Realised = realised;
	}

}
