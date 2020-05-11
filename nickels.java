import java.util.Scanner;
public class nickels 
{
    public static void main (String[] args) 
    	{
    		double dollars, half_dollars, quarters, dimes, nickels, pennies;
    		Scanner scan = new Scanner (System.in);
    		System.out.println ("Input number of dollars: ");
    		dollars = scan.nextDouble ();
    		System.out.println ("Input number of half-dollars: ");
    		half_dollars = scan.nextDouble ();
    		System.out.println ("Input number of quarters: "); 
    		quarters = scan.nextDouble ();
    		System.out.println ("Input number of dimes:");
    		dimes = scan.nextDouble ();
    		System.out.println ("Input number of nickels:"); 
    		nickels = scan.nextDouble ();
    		System.out.println ("Input number of pennies:");
    		pennies = scan.nextDouble ();
    		System.out.println ("The number of coins that you input are: " + dollars + " dollars, " + half_dollars + " half-dollars, " + quarters 
            + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies."); 
            dollars = (dollars * 1) + (half_dollars * 0.50) + (quarters * 0.25) + (dimes + 0.10) + (nickels + 0.05) + (pennies + 0.01);
            System.out.println ("How much you have is: $" + dollars);  		
    }
}

    
    