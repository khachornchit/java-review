package pluto.java8;

import pluto.features.ICore;

/**
 * 
 * @author pluto
 *
 */
public class Welcome implements ICore {

	@Override
	public void perform() {
		System.out.println("Welcome !");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}