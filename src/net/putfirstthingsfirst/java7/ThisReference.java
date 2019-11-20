package net.putfirstthingsfirst.java7;

import net.putfirstthingsfirst.features.IProcess;

public class ThisReference {

	public void doProcess(int i, IProcess p) {
		p.process(i);
	}

	public static void main(String[] args) {
		ThisReference thisReference = new ThisReference();
		thisReference.doProcess(9, new IProcess() {

			@Override
			public void process(int i) {
				System.out.println(String.format("The value is %s", i));
				System.out.println(this);
			}
			
			public String toString() {
				return "This is toString() function inner the class.";
			}
		});
	}

}
