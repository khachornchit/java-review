package pluto.java8.thisreference;

import pluto.features.IProcess;

public class ThisReference {

	public void doProcess(int i, IProcess p) {
		p.process(i);
	}

	public void executeThis() {
		doProcess(9, i -> {
			System.out.println(String.format("The value is %s", i));
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReference thisReference = new ThisReference();
		thisReference.executeThis();
	}
	
	public String toString() {
		return "The class ThisReference !";
	}

}
