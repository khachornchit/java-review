package chorn.in.th.fundamentals;

public class ArrayConcept {

    public static void main(String[] args) {

        int[] ints = new int[5];
        double[] doubles = new double[10];
        boolean[] booleans = new boolean[10];
        String[] strings = new String[10];

        for (int j = 0; j < 5; j++) {
            ints[j] = (j + 10) * (j + 1);
            doubles[j] = ints[j] + 0.25;
            booleans[j] = true;
            strings[j] = "Hello " + j;

            System.out.printf("%d, %.2f, %s, %s\n", ints[j], doubles[j], booleans[j], strings[j]);
        }

//		Mixed object array
        Object[] obj = new Object[10];
        obj[0] = "Hello1";
        obj[1] = true;
        obj[2] = 30.8;
        obj[3] = 1000;
        obj[4] = "Hello4";
        obj[5] = false;

        for (int j = 0; j < 5; j++) {
            System.out.printf("%d - %s%n", j, obj[j].toString());
        }
    }

}
