package pluto.java8;

import pluto.features.ICore;

/**
 * 
 * @author pluto
 *
 */
public class Hello {

	/**
	 * 
	 * @param pluto
	 */
	public void greet(ICore pluto) {
		pluto.perform();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hello greeting = new Hello();
		
		ICore lambdaFunction = () -> System.out.println("Lambda expression");
		
		ICore inlineCore = new ICore() {
			
			@Override
			public void perform() {
				System.out.println("Inline Core Function");
			}
		};
		
		greeting.greet(inlineCore);
		lambdaFunction.perform();
	}

}