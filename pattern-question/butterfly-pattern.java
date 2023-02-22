import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
			{
				for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
				for(int j=0; j<2*(n-i-1); j++)
					{
						System.out.print(" ");
					}
				for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
				System.out.println();
			}
		for(int i=n; i>0; i--)
			{
				for(int j=0; j<i; j++)
					{
						System.out.print("*");
					}
				for(int j=0; j<2*(n-i); j++)
					{
						System.out.print(" ");
					}
				for(int j=0; j<i; j++)
					{
						System.out.print("*");
					}
				System.out.println();
				
			}
	}
}