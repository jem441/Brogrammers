package com.charlie.model;

public class TestContainer {

	public static void main(String[] args) {
		Container<String> container = new Container<>();
		container.setObject("Hello");
		
		System.out.println(container.getObject());
	}
}
