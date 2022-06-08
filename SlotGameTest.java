/*
javac -cp ".;junit-4.12.jar" PrintTest.java

java -cp ".;hamcrest-core-1.3.jar;junit-4.12.jar" \
     org.junit.runner.JUnitCore \
     PrintTest
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
* Testing the SlotGameTest class
* 
* @author      Pavithra Subramaniyam; pavithra.subramaniyam@tuni.fi;             
*                        
*/
@RunWith(JUnit4.class)
public class SlotGameTest {

    /**
    * This test to verify whether the string out is correct or incorrect 
    * <p> AssertEquals method has been used                      
    */
    @Test
    public void WinningConditionTest(){
        int a = 2;
        int b = 3;
        int c = 2;
        SlotGame obj = new SlotGame();
        assertEquals(obj.FruitName(a,b,c),"Congratulations, you have won 50$");
    }

    /**
    * This condition is to check for the highest winning condition
    * <p> AssertEquals method has been used                      
    */
    @Test
    public void BarConditionTest(){
        int a = 6;
        int b = 6;
        int c = 6;
        SlotGame obj = new SlotGame();
        assertEquals(obj.FruitName(a,b,c),"Congratulations,You have won $100");
    }

    /**
    * This condition is same as first condition but numbers have been changed
    * <p> AssertEquals method has been used                      
    */
    @Test
    public void DifferentNumConditionTest(){
        int a = 1;
        int b = 2;
        int c = 3;
        SlotGame obj = new SlotGame();
        assertEquals(obj.FruitName(a,b,c),"No matches found");
    }

    /**
    * actual and expected values are not equal 
    * <p> AssertNotEquals method has been used                      
    */
    @Test
    public void NotEqualConditionTest(){
        int a = 1;
        int b = 1;
        int c = 1;
        SlotGame obj = new SlotGame();
        assertNotEquals(obj.FruitName(a,b,c),"No matches found");
    }
}
