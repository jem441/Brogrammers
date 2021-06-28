package com.example.test;

import com.example.Person;
import com.example.Developer;

public class TestPerson {
	
	public static void main(String[] args) {
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
	}

}
