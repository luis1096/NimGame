/**
 * Class Pile implements Interface Player and keeps the current amount of
 * marbles in the pile for each run of the game of Nims.
 */
/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
import java.util.Random;
public class Pile 
{
    //holds number of marbles
    private int marbles;
    Random r = new Random(); 
   
    /**
     * constructor just initializes a pile with a random number of marbles from
     * 1 to 100
     */
    public Pile()
    {
        marbles = r.nextInt((100 + 1) - 10) + 10;
    }
    
    /**
     * method that returns the size of the pile of marbles the number of marbles
     * @return int marbles the number of marbles in the pile currently
     */
    public int pileSize()
    {
       return marbles; 
    }
    
    /**
     * methods the removes an amount of marbles from the pile the amount comes
     * from one the of move methods of one the classes that implements Player
     * @param int marbles the number of marbles to take out 
     */
    public void remove(int takeOut)
    {
        marbles = marbles - takeOut;
    }
    
 
   
    
    
    
    
}
