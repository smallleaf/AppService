package com.app.DesignPatterns.simpleFactory;

/**简单工厂，帮你实现各种pizza，将各种pizza(根据条件变化的，让工厂来做)**/
public class SimplePizzaFactory {
		
	public static Pizza createPizza(String type){
		Pizza pizza =null;
		if(type.equals("cheese")){
			pizza = new CheesePizza();
		}else if (type.equals("clam")) {
			pizza = new ClamPizza();
		}
		
		return pizza;
	}
}
