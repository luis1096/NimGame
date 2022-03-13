/**
 * class DumbComputer that implements the Player interface and designs how
 * A Dumb Computer plans to move for the game of Nim.
 */
/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
import java.util.Random;

public class DumbComputer implements Player
{
    //random object created 
    Random r = new Random();
    private int takeOut; 
    private String name = "DumbComputer";
    
    /**
     * move method has the dumb computer take out a random number of marbles
     * that can range from 1 to half of the current piles size
     * @param marbles the piles current size
     * @return int takeout the marbles the are going to be removed
     */
    public int move(int marbles)
    {
        takeOut = r.nextInt((marbles/2 + 1) - 1) + 1;
        System.out.println("\n" + name + " removed " + takeOut + " marbles");
        return takeOut;
    }
    /**
     * method that returns the name of the player in this case the name is just
     * set to DumbComputer
     * 
     * @return String name the name of the player which is DumbComputer
     */
    public String getName()
    {
        return name;
    }
    
}
