package com.zr.class3.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.class3.model.Country;
import com.zr.class3.service.StudentService;

@RestController
@RequestMapping("/op")
public class OpApi {
	
	@Autowired
	private StudentService studentservice;
	
	
	@RequestMapping("/save")
	public Country opSave() {
		
		return studentservice.savestudent();
	}
}
