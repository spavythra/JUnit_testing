import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

/**
 * Creates random numbers using Random lib
 * 
 * @author  Pavithra Subramaniyam;  pavithra.subramaniyam@tuni.fi;              
 *                        
 */


public class RandomFruit {
    // random number
    private int ranNumber;
    private Random random;
    private Integer number;
 
    /**
     * <p> generating random number with the range of given argument
     *                  
     * @param   getNumber   range
     * @return  number      any random number                        
     */

    // getNumber = random maxim number
    public Integer GetRandom(int getNumber) {
 
        //new random object
        random = new Random();
        ranNumber = random.nextInt(getNumber);
        // wrap int into a object
        number = ranNumber;
        // return the random number
        return number;
    }

    /**
     * <p> checking whether the generated random number is within the range
     *                   
     * @param   i           given range
     * @return  true|false  if condition                       
     */


    public Boolean NumberRange(int i) {
        int a;
 
        RandomFruit num = new RandomFruit();
        a = num.GetRandom(i);
        if (a<i && a>=0){
            return true;
        } else {
            return false;
        }

    }
}

