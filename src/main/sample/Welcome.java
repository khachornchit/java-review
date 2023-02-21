package sample;

import sample.features.IPerform;

public class Welcome implements IPerform {

	@Override
	public void perform() {
		System.out.println("Java8Sample.Welcome !");
	}

	public static void main(String[] args) {

	}

}
