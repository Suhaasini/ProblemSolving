package Athena;
import java.util.Scanner;
import java.util.Arrays;
public class Coins
{
	public static void calculate(int val,int[] arr)
	{
		int l=arr.length;
		for(int i=l-1;i>=0;i--)
		{
			int temp;
			temp=val/arr[i];
			System.out.println(arr[i]+": "+temp);
			val=val-(temp*arr[i]);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int val=sc.nextInt();
		System.out.print("Enter the number of denominations available: ");
		int n=sc.nextInt();
		System.out.println("Enter the values: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		calculate(val,arr);
		sc.close();
	}
}
