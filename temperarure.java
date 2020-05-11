import java.util.Scanner;
public class temperarure 
{
	public static void main (String[] args) 
		{
			Scanner scan=new Scanner(System.in); 
			 final  int BASE =32;
            final double   CONVERSION_FACTOR = 9.0 / 5.0;
            int celsiusTemp;
            double fahrenheitTemp;
            celsiusTemp=scan.nextInt();
			fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
			System.out.println ("Celsius Temperature: " + celsiusTemp);
			System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
    }
}

    
    