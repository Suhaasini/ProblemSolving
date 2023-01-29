package Athena;
import java.util.Scanner;
public class Calculate
{ 
	public static void disp(int n, String s)
	{
		String ones[] = { " ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", " Ten",
		        " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
		        " Nineteen" };		 
		String tens[] = { "", "", " Twenty-", " Thirty-", " Forty-", " Fifty-", " Sixty-", "Seventy-", " Eighty-", " Ninety-" };
		if (n > 19)
		      System.out.print(tens[n/10] + "" + ones[n % 10]);
		else
		      System.out.print(ones[n]);
		if (n > 0)
		      System.out.print(s);
	}
	public static void main(String[] args)
	{
	  	System.out.print("Enter the number: ");
	  	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    disp(((n/1000)%10)," thousand ");
	    disp(((n / 100) % 10), " hundred");
	    disp((n % 100), "");
	    sc.close();
	}
}