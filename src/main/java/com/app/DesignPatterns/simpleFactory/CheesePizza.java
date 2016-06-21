package com.app.DesignPatterns.simpleFactory;

/**继承了Pizza，我们可以具体实现我们需要**/
public class CheesePizza extends Pizza{
	
	public void prepare(){
		System.out.println("CheesePizza........");
	}
}
