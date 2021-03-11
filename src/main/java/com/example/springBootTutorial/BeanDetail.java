package com.example.springBootTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanDetail {
	private  int id;
	private String name;
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("in show");
		laptop.compile();
	}
	
}
