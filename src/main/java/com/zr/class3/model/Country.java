package com.zr.class3.model;

public class Country {
	private String Code;
	private String Name;
	private String Continent;
	private String Region;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String continent) {
		Continent = continent;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [Code=");
		builder.append(Code);
		builder.append(", Name=");
		builder.append(Name);
		builder.append(", Continent=");
		builder.append(Continent);
		builder.append(", Region=");
		builder.append(Region);
		builder.append("]");
		return builder.toString();
	}
}
