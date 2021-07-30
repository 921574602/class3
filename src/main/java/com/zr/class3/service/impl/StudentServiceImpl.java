package com.zr.class3.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zr.class3.mapper.BlogMapper;
import com.zr.class3.model.Country;
import com.zr.class3.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private BlogMapper blogmapper;
	
	
	@Override
	public Country savestudent() {
		Country country = blogmapper.searchcountry("ABW");
		return country;
	}
}
