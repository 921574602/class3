package com.zr.class3.model;

public class Language {
	String name;
	String offiec;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String isOffiec() {
		return offiec;
	}
	public void setOffiec(String offiec) {
		this.offiec = offiec;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Language [name=");
		builder.append(name);
		builder.append(", offiec=");
		builder.append(offiec);
		builder.append("]");
		return builder.toString();
	}
}
