package sample;

import sample.features.IPerform;
//
public class Hello {

	public void greet(IPerform pluto) {
		pluto.perform();
	}

	public static void main(String[] args) {
		Hello greeting = new Hello();
		
		IPerform lambdaFunction = () -> System.out.println("Lambda expression");
		
		IPerform inlineCore = new IPerform() {
			
			@Override
			public void perform() {
				System.out.println("Inline Core Function");
			}
		};
		
		greeting.greet(inlineCore);
		lambdaFunction.perform();
	}

}
