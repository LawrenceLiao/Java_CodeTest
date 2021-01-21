import org.junit.*;


import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void calculateImg() {
        Calculator calculator = new Calculator(4,16,13);
        List<Bundle> list = calculator.calculateImg();

        assertEquals(1, list.get(0).getNumOfBundles());
        assertEquals(5, list.get(0).getNumOfPosts());

    }

    @Test
    public void calculateFlac() {
        Calculator calculator = new Calculator(4,16,13);
        List<Bundle> list = calculator.calculateFlac();

        assertEquals(9, list.get(0).getNumOfPosts());
        assertEquals(2, list.get(0).getNumOfBundles());
    }

    @Test
    public void calculateVid() {
        Calculator calculator = new Calculator(4,16,13);
        List<Bundle> list = calculator.calculateVid();

        assertEquals(2, list.size());
        assertEquals(2, list.get(0).getNumOfBundles());
        assertEquals(5, list.get(0).getNumOfPosts());
    }
}