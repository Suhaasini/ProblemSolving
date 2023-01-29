package Athena;
import java.util.Scanner;
public class RPS 
{
	public static String ROCK = "R";
	public static String PAPER = "P";
	public static String SCISSORS = "S";
	public static int u1=0;
	public static int u2=0;
	public static void getResult(String usersMove1, String usersMove2)
	{	 
			
	        if (usersMove1.equals(usersMove2))
	        	u1+=0;
	        else if (usersMove1.equals(ROCK))
	        {
		        if (usersMove2.equals(SCISSORS))
		        	u1+=1;
		        else if (usersMove2.equals(PAPER))
		        	u2+=1;
	        }
	        else if (usersMove1.equals(PAPER))
	        {
	            if (usersMove2.equals(ROCK))
	            	u1+=1;
	            else if (usersMove2.equals(SCISSORS))
	            	u2+=1;
	        }
	        else if (usersMove1.equals(SCISSORS))
	        {
		        if (usersMove2.equals(PAPER))
		        	u1+=1;
		        else if (usersMove2.equals(ROCK))
		        	u2+=1;
	        }
	        else
	        	System.out.println("Invalid user input.");
	    }

	public static String getUsersMove1()
	{
			System.out.println("User 1 :");
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter your play: ");
		    String input = scanner.next().toUpperCase();
		    return input;
	}	
	
	public static String getUsersMove2()
	{
			System.out.println("User 2 :");
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter your play: ");
		    String input = scanner.next().toUpperCase();
		    return input;
	}	
	public static void main(String[] args)
	{
		System.out.println( "Rock, Paper, Scissors!\nPlease enter a move.\nRock = R, Paper= P, and Scissors = S.\n");
		System.out.print("Enter the number of times you want to play: \n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String userInput1 = getUsersMove1();
			String userInput2= getUsersMove2();
			if (userInput1.equals(PAPER) || userInput1.equals(ROCK) || userInput1.equals(SCISSORS))
				if (userInput2.equals(PAPER) || userInput2.equals(ROCK) || userInput2.equals(SCISSORS))
					getResult(userInput1, userInput2);
			else
			{
				System.out.println("Invalid Input ");
				break;
			}
		}
		if(u1>u2)
			System.out.println("User1 wins!!");
		else if(u2>u1)
			System.out.println("User2 wins!!");
		else if(u1==u2)
			System.out.println("It's a tie!");
		sc.close();
	}
}