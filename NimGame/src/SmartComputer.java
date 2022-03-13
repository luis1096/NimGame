/**
 * class SmartComputer implements the Player interface and mimics how a 
 * smart computer would play the game of Nims for each of its moves.
 */

/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
import java.util.Random;
public class SmartComputer implements Player
{
    Random r = new Random();
    private int takeOut;
    private String name = "SmartComputer";
    
    /**
     * method that will portray how the smart computer plays on each of its 
     * turns depending on how many marbles are currently in the pile
     * @param marbles the current size of the pile of marbles
     * @return int takeOut the amount to remove from the pile
     */
    public int move(int marbles)
    {
        //if the current size of the pile is 2^n - 1 then the smart computer
        //take a random amount of marbles out
        if(marbles == 1 || marbles == 3 || marbles == 7 || marbles == 15 || marbles == 31 || marbles == 63)
        {
            takeOut = r.nextInt((marbles/2 + 1) - 1) + 1;
        }
        //else it checks if each 2^n -1 number is greater than
        //the current size of the pile and when its not it subtracts the marbles
        // from the pile from the last number that was greater than the pile
        else
        {
            int i = 63;
            while(i > marbles)
            {
                i = i / 2;
            }
        
            takeOut = marbles - i;
        }
          System.out.println("\n" + name + " has removed " + takeOut + " marbles");
          return takeOut;
    }
    
    /**
     * method that returns the name of the player in this case the SmartComputer
     * @return String name gives the name of the SmartComputer which is SmartPC.
     */
    public String getName()
    {
        return name;
    }
    
}
