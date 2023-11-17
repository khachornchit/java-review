package chorn.in.th.fundamentals;

public class Conditions {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        int c = 64;
        int d = 95;

        for (int i = 2; i < 10; i++) {
            if (a % i == 0) {
                System.out.printf("%d %% %d = 0%n", a, i);
            }
            if (b % i == 0) {
                System.out.printf("%d %% %d = 0%n", b, i);
            }
            if (c % i == 0) {
                System.out.printf("%d %% %d = 0%n", c, i);
            }
            if (d % i == 0) {
                System.out.printf("%d %% %d = 0%n", d, i);
            }
        }
    }

}
