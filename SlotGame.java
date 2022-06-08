import java.util.*;

/**
 * @author  Pavithra Subramaniyam;  pavithra.subramaniyam@tuni.fi;
 * <p>This class has 3 different classes               
 * <p>which are main class, startGame class and FruitName class 
 * <p>It is a public so that we can access it from out of the class
 * <p>This will ask the bet amount from the user and return a string based on the winning condition
 *                     
 */

public class SlotGame
{

    /**
    * <p>main class
    *<p> this class will call another class which is startGame
    *                         
    */

 
    public static void main(String[] args) {
 
        new SlotGame().startGame();
    }

    /**
    *<p> starts the game and prints the fruit name as per the random number selection
    * <p>ask for the user input as bet amount
    *<p> after getting the bet amount, the game starts and the fruit names will be printed
    * <p>the next class will be called to know the winning result
    * <p>again user needs to enter y/n to continue/quit the game                       
    */

 
    public void startGame() {
        Scanner keyboard = new Scanner(System.in);
        // RandomFruit random = new RandomFruit();
        String cont = "y";
        int coin = 0;
        int totalEntered = 0;
        int a;
        int b;
        int c;
        int n;
        int amountWon = 0;
        int dubs = coin * 2;
        int trips = coin * 4;
 
        while (cont.equals("y"))
        {
            RandomFruit firstNum = new RandomFruit();
            RandomFruit SecondNum = new RandomFruit();
            RandomFruit thirdNum = new RandomFruit();
            RandomFruit numbers = new RandomFruit();
            a = firstNum.GetRandom(7)+0;
            b = SecondNum.GetRandom(7)+0;
            c = thirdNum.GetRandom(7)+0;
            n = numbers.GetRandom(991)+10;
            totalEntered += coin;
            System.out.println("How much would you like to bet? ");
            coin = keyboard.nextInt();
            // System.out.println("coin is"+ coin);
            cont = keyboard.nextLine();
            System.out.println("Game starts...");
 
            switch (a) 
            {
                case 0:
                    System.out.println("Lemon");
                    break;
                case 1:
                    System.out.println("Cherry");
                    break;
                case 2:
                    System.out.println("Banana");
                    break;
                case 3:
                    System.out.println("Melon");
                    break;
                case 4:
                    System.out.println("Orange");
                    break;
                case 5:
                    System.out.println("Plum");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
            }
 
            switch (b) 
            {
                case 0:
                    System.out.println("Lemon");
                    break;
                case 1:
                    System.out.println("Cherry");
                    break;
                case 2:
                    System.out.println("Banana");
                    break;
                case 3:
                    System.out.println("Melon");
                    break;
                case 4:
                    System.out.println("Orange");
                    break;
                case 5:
                    System.out.println("Plum");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
            }
 
            switch (c) 
            {
                case 0:
                    System.out.println("Lemon");
                    break;
                case 1:
                    System.out.println("Cherry");
                    break;
                case 2:
                    System.out.println("Banana");
                    break;
                case 3:
                    System.out.println("Melon");
                    break;
                case 4:
                    System.out.println("Orange");
                    break;
                case 5:
                    System.out.println("Plum");
                    break;
                case 6:
                    System.out.println("Bar");
                    break;
            }

            new SlotGame().FruitName(a, b, c);
 
            System.out.println("Continue? y/n ");
            cont = keyboard.nextLine();
        }
    }

    /**
    * returns the winning results
    * <p> getting the parameter values from RandomFruit class, then returns the winning results based on the condition
    * 
    * @param    a   random number from RandomFruit class
    * @param    b   random number from RandomFruit class
    * @param    c   random number from RandomFruit class
    * @return   string, winning condition
    */

    public String FruitName(int a,int b,int c)
    {
        

            if (a != b && a != c && b != c)
            {
                System.out.println("You have won $0");
                return "No matches found";
            }
            else if (a == 6 && b == 6 && c == 6)
            {
                System.out.println("Congratulations,You have won $100");
                return "Congratulations,You have won $100";
 
            }
            else if (a == b || a == c || b == c)
            {
               
                System.out.println("Congratulations, you have won 50$");
              
                return "Congratulations, you have won 50$";
                   
            }
            
            return "nothing";
        
    }
}