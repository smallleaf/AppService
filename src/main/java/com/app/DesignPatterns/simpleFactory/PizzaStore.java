package com.app.DesignPatterns.simpleFactory;

public class PizzaStore {
	
	
	/**这里不用再改变了，只用调整工厂就可以了*/
	public void createPizza(String type){
		Pizza pizza = SimplePizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
	}
}
