package com.zr.class3.model;

import java.util.List;

public class Country_Language {
	Country c;
	List<Language> languages;
	public Country getC() {
		return c;
	}
	public void setC(Country c) {
		this.c = c;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country_Language [c=");
		builder.append(c);
		builder.append(", languages=");
		builder.append(languages);
		builder.append("]");
		return builder.toString();
	}
}
