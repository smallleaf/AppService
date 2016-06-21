package com.app.DesignPatterns.simpleFactory;

/**
 * 
 * 将pizza定义抽象类，来实现子类可以实现自己
 * **/
public abstract class Pizza {
	
	public void prepare(){
		System.out.println("Pizza.....");
	}
	
	public void bake(){
		System.out.println("bake.......");
	}
	
	public void cut(){
		System.out.println("cut........");
	}
	public void box(){
		System.out.println("box........");
	}
}
