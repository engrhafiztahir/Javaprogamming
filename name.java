
import java.util.Scanner;
public class name 
{
    public static void main (String[] args) 
    	{
    		int name,age,college,petName;	
    		Scanner scan=new Scanner(System.in); 
    		System.out.print("What is your name? ");
            name = scan.nextInt();
            System.out.print("What is your age? ");
            age = scan.nextInt();
            System.out.print("What is your college? ");
            college = scan.nextInt();
            System.out.print("What is your pet\'s name? ");
            petName = scan.nextInt();
            System.out.println("Hello, my name is " + name + " and I am " + age+ " years \nold. I\'m enjoying my time at " + college
           	+ ", though \nI miss my pet " + petName + " very much!");

    }
    }
    