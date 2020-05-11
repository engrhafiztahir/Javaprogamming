import java.util.Scanner;
public class table 
{
public static void main (String[] args) 
{
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter number:");
	   int n;
	   int i;        
	   n=s.nextInt();
        for(i=0; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}