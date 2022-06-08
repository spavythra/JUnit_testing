// javac -cp ".:cpsuite-1.2.6.jar:junit-4.12.jar" TestSuiteAll.java
//
// https://github.com/takari/takari-cpsuite
//
// This will execute all JUnit4 testclasses (those containing methods
// with the @Test annotation) in the projects classpath.

// import org.junit.extensions.cpsuite.ClasspathSuite;
// import org.junit.extensions.cpsuite.ClasspathSuite.*;
// import static org.junit.extensions.cpsuite.SuiteType.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

/**
* Testing the All the classes which have been included in this project
* 
* @author Pavithra Subramaniyam; pavithra.subramaniyam@tuni.fi;              
*                        
*/

@RunWith(Suite.class)

   /**
    * 
    * <p> add the class, which we want to run them together                     
    */
@Suite.SuiteClasses({
   RandomFruitTest.class,
   SlotGameTest.class
})


public class TestSuiteAll {
                 // This class remains empty, it is used only as a holder for the above annotations		
}
