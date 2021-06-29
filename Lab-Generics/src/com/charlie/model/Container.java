package com.charlie.model;

public class Container<T> {

	private T obj;
	
	public void setObject(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
	public T removeObject() {
		T temp = this.obj;
		obj = null;
		
		return temp;
	}
}
