package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sample.MathOperation;

public class IAddTests {
    IAdd operation = new MathOperation();
    @Test
    public void testAddInteger() {
        Assertions.assertEquals(25, operation.add(10, 15));
    }

    @Test
    public void testAddDouble() {
        Assertions.assertEquals(25.7, operation.add(10.5, 15.2));
    }
}
