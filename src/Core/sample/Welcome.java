package src.core.sample;

import src.core.sample.features.IPerform;

/**
 * 
 * @author pluto
 *
 */
public class Welcome implements IPerform {

	@Override
	public void perform() {
		System.out.println("Java8Sample.Welcome !");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
