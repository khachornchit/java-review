package chorn.in.th.sample.closure;

import chorn.in.th.model.IProcess;

public class Closures {

	public static void main(String[] args) {
		int val = 9;
		int count = 100;

		doProcess(val, i -> System.out.printf("val + count = %s%n", i + count));
	}

	public static void doProcess(int i, IProcess p) {
		p.process(i);
	}

}
