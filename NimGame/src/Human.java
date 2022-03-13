/**
 * class Human that implements the Interface Player that plays its turn 
 * on commands given by the user
 */

/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
import java.util.Scanner;
public class Human implements Player 
{
    //Scanner object created to record user responses for the game of nim
    Scanner in = new Scanner(System.in);
    private int takeOut;
    private String name;
    
    /**
     * constructor made so that the user can input their name
     * @param String name the user name
     */
    public Human(String name)
    {
        this.name = name;
    }
    
    /**
     * the move method simulates how the user will play their turn in the game
     * of Nims they are free to remove any amount from 1 to half the current 
     * marbles in the pile
     * @param marbles the size of the pile
     * @return int takeOut the number of marbles that will be removed from pile.
     */
    public int move(int marbles)
    {   
        System.out.println("\nenter the amount of marbles to remove");
        takeOut = in.nextInt(); //user enters how much to take out
        
        //while their answer is valid to the rules of the games so that they 
        //dont take out to many marbles to take out negative numbers.
        while( takeOut < 1 || takeOut > marbles/2 )
        {
            System.out.println("Hey stop invalid input. "
            + "Remove 1 or up to half of the remaining marbles");
            takeOut = in.nextInt();
        }
        System.out.println("\n" + name + " has removed " + takeOut + " marbles");
        return takeOut; //returns amount of marbles to take out
    }
    
    /**
     * method that returns the name of the user 
     * @return String name the name of the player
     */
    public String getName()
    {  
        return name;
    }
    
}
