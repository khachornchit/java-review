package chorn.in.th.sample.this_reference;

import chorn.in.th.model.IProcess;

public class ThisReference {

    public void doProcess(int i, IProcess p) {
        p.process(i);
    }

    public void executeThis() {
        doProcess(9, i -> {
            System.out.printf("The value is %s%n", i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReference thisReference = new ThisReference();
        thisReference.executeThis();
    }

    public String toString() {
        return "The class Java8Sample.ThisReference !";
    }

}
