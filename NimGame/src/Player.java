/**
 * interface Player that has two methods, one determines hows a player moves
 * and the other determines what the name of each player is
 */

/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
public interface Player 
{
    /**
     * 
     * @param marbles the size of the pile of marbles
     * @return and integer that will subtract the pile size
     */
    int move(int marbles);
    
    /**
     * abstract method that returns a String which is the name of the player
     * @return a String for the name of the player.
     */
    String getName(); 
}
