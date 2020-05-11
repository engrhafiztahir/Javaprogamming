import java.util.Scanner;
public class area 
{
	public static void main (String[] args) 
		{
			Scanner data=new Scanner(System.in);
			float  l;
		    float  w;
			float  area;
		    l=data.nextFloat();
		    w=data.nextFloat(); 
			System.out.println("Please enter the Length:");
			System.out.println("Please enter the Width:");
			area=l*w;
			System.out.println("The area is:"+area); 
    }
}

    
    