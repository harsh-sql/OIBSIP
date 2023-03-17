import java.io.*;
import java.util.*;
public class guessnumber{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int i;
        Random rand = new Random();
        int r = rand.nextInt(100);
        int turns=5;
        System.out.println("Guess a number between 1 to 100: ");
        System.out.println("You have 5 Turns.");
        for(i = 0; i<5; i++)
        {
            int n = sc.nextInt();
            if(n == r)
            {
                System.out.println("YOU GUESSED IT RIGHT :)))");
                break;
            }
            else if(n>r)
            {
                System.out.println("LOWER!!!");
                turns=turns-1;
                System.out.println("TURN LEFT: "+turns);
                System.out.println(" ");
                
            }
            else if (n<r)
            {
                System.out.println("HIGHER!!!");
                turns=turns-1;
                System.out.println("TURN LEFT: "+turns);
                System.out.println(" ");
            }
        }
        if(i==5)
        {
            System.out.println("You have exhausted the number of turns :(");
            System.out.println(" ");
            System.out.println("The number was: "+r);
        }
    }
}
