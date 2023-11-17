package chorn.in.th.sample;

import chorn.in.th.model.IPerform;
//
public class Hello {

	public void greet(IPerform pluto) {
		pluto.perform();
	}

	public static void main(String[] args) {
		Hello greeting = new Hello();
		IPerform lambdaFunction = () -> System.out.println("Lambda expression");
		IPerform inlineCore = () -> System.out.println("Inline Core Function");
		
		greeting.greet(inlineCore);
		lambdaFunction.perform();
	}

}
