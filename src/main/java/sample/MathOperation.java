package sample;

import model.IAdd;

public class MathOperation implements IAdd {
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public double add(double x, double y) {
        return x+y;
    }
}
