/*
javac -cp ".;junit-4.12.jar" PrintTest.java

java -cp ".;hamcrest-core-1.3.jar;junit-4.12.jar" \
     org.junit.runner.JUnitCore \
     PrintTest
*/

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Testing the RandomFruit class
 * 
 * @author  Pavithra Subramaniyam;  pavithra.subramaniyam@tuni.fi;              
 *                        
 */

public class RandomFruitTest {
    /**
    * Simple number test 
    * <p> AssertEquals method has been used                      
    */
    @Test
    public void NumberTest(){
        var number = new RandomFruit();
        assertEquals(Double.valueOf(0),Double.valueOf(number.GetRandom(1)) );
    }

    /**
    * This is to check the given range
    * <p> AssertTrue method has been used                      
    */
    @Test
    public void RangerTest(){
        var number = new RandomFruit();
        assertTrue(number.NumberRange(3));
    }

}