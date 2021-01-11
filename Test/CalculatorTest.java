import org.junit.*;


import java.util.Map;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void calculateImg() {
        Calculator calculator = new Calculator(4,16,13);
        //Map<Integer,Integer> numOfBundles = calculator.calculateImg();

       //assertTrue(numOfBundles.get(5)==1);

    }

    @Test
    public void calculateFlac() {
        Calculator calculator = new Calculator(4,16,13);
        //Map<Integer,Integer> numOfBundles = calculator.calculateFlac();

        //assertTrue(numOfBundles.get(9)==2);

    }

}