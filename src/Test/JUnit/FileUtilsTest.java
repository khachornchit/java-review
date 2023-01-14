package src.Test.JUnit;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class FileUtilsTest {

    @Test
    public void testExample() {
        int[] expected = {1, 2};
        int[] actual = {1, 2};
        assertArrayEquals(expected, actual);
    }
}
