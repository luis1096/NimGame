/** 
 * nim class that simulates the game of nim between two players.
 */
/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
public class Nim 
{
    private String winner; //instance variable that will return winner object
    private Pile marbles; //pile object made to access pile class and marble num
    
    /**
     * constructor initializing two instance variables one to create a pile
     * of marbles of the game and one to hold the winner of the game of nim.
     */
    public Nim()
    {
        marbles = new Pile();// new object pile
        winner = ""; // winner set to nothing first
    }
    /**
     * play method that takes two Player objects that can be any of the classes 
     * that implement that interface player, It simulates the game of nim and 
     * then returns a string that equals the winner of the game. 
     * 
     * @return String winner the name of the Player object
     * @param Player one and Player two objects of the Player interface
     */
    public String play(Player one, Player two)
    {
        System.out.println("\nThe game will be " + one.getName() + " against " + two.getName() + "\n");
        System.out.println("marbles in pile = " + marbles.pileSize());
        boolean finish = false;
        
        // while the pile of marbles is greater than 0 or finish is false.
        while(marbles.pileSize() > 0 && finish == false )
        {
           //removes the amount of marbles from the pile depending on the move  
           //method for the player object of one
           marbles.remove(one.move(marbles.pileSize()));
           System.out.println("marbles in pile = " + marbles.pileSize());
           
           //if the pile of marbles equals 1 after player ones turn then player 
           //one wins because player two must take the last marble
           if(marbles.pileSize() == 1)
           {
              winner = one.getName();
              finish = true;    
           }
           //if the pile of marbles is not 1 then player two plays if 
           else if(marbles.pileSize() != 1)
           {
               //removes an amount of marbles from the pile depending on 
               //the move method for the player object of two
               marbles.remove(two.move(marbles.pileSize()));
               System.out.println("marbles in pile = " + marbles.pileSize());
               
               //if the pile of marbles equals 1 after player twos turn then 
               //player two wins because player one must take the last marble
               if(marbles.pileSize() == 1)
               {
                   winner = two.getName();
                   finish = true;
               }
           }
        }
        return winner;
    }
    
    /** 
     * method that returns the name of the winner of the game of Nims
     * 
     * @return String winner the name of the Player object 
     */
    public String getWinner()
    {
        return  winner;
    }
}
