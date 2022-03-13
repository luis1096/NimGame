/**
 * main class that prints the results of every possible game of nim between
 * human , smart computer , and dumb computer.
 */
/**
 * @version 3/4/2019
 * @author Luis Oliveros [6131616]
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
       //used in while loop to see when game ends.
       String answer = "yes";
       
       //while the user types yes the game keeps going
       while(answer.equalsIgnoreCase("yes"))
       { 
           String name2 = ""; 
           String name = "";
           Scanner in = new Scanner(System.in); //for user inputs scanner made
           System.out.println("Welcome To The Game of Nim\n"); 
           System.out.println("Whos playing first? (Human, SmartPC or DumbPC)");
           String first = in.next();
          
           //if first player is a human user enters name
           if(first.equalsIgnoreCase("human"))
           {
               System.out.println("\nenter your name");
               name = in.next();
           }
          
           System.out.println("\nWhos playing second? (Human, SmartPC DumbPC)");
           String second = in.next();
           
           //if second player is a human user enters name
           if(second.equalsIgnoreCase("human"))
           {
               System.out.println("\nenter your name");
               name2 = in.next();
           }
           
           //creating all of the Player objects of all the classes that
           //implement the Player interface
           Player h2 = new Human(name2);
           Player h1 = new Human(name);
           Player sc = new SmartComputer();
           Player dc = new DumbComputer();
           Nim n = new Nim();
       
           //all possible game combinations between a human, smart computer
           //and dumb computer that prompts the play method of nim.
           if(first.equalsIgnoreCase("human") && second.equalsIgnoreCase("human"))
           {
               n.play(h1,h2);     
           }
           else if(first.equalsIgnoreCase("human") && second.equalsIgnoreCase("SmartPC"))
           {
                n.play(h1,sc);
           }
           else if(first.equalsIgnoreCase("human") && second.equalsIgnoreCase("DumbPC"))
           {
                n.play(h1,dc);
           }
            else if(first.equalsIgnoreCase("SmartPC") && second.equalsIgnoreCase("human"))
           {
                n.play(sc,h2);
           }
           else if(first.equalsIgnoreCase("DumcPC") && second.equalsIgnoreCase("human"))
           {
                n.play(dc,h2);
           }
           else if(first.equalsIgnoreCase("DumbPC") && second.equalsIgnoreCase("SmartPC"))
           {
                n.play(dc,sc);
           }
           else if(first.equalsIgnoreCase("SmartPC") && second.equalsIgnoreCase("DumbPC"))
           {
                n.play(sc,dc);
           }
           else if(first.equalsIgnoreCase("SmartPC") && second.equalsIgnoreCase("SmartPC"))
           {
                n.play(sc,sc);
           }
           else if(first.equalsIgnoreCase("DumbPC") && second.equalsIgnoreCase("DumbPC"))
           {
                n.play(dc,dc);
           }
           
           //final output message that prints winner and if they wish to play
           //again
           System.out.println("\nAnd The Winner is......\n" + n.getWinner() + "! Congratulations on this extreme accomplishment");
           System.out.println("\nWould you like to play again (yes) or (no) ?");
           answer = in.next();
           //if no or any key the while loop terminates and the game ends
           if(answer.equalsIgnoreCase("no"))
           {
               System.out.println("\nok good bye now.");
           }
       }
    }
}
