package sample;

import model.IPerform;

public class Welcome implements IPerform {

	@Override
	public void perform() {
		System.out.println("Welcome Java8 !");
	}

	public static void main(String[] args) {

	}

}
