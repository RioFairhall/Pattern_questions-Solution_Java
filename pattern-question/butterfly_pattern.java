import java.util.*;
import java.lang.*;
import java.io.*;

public class butterfly_pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//input from user
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//upper part
		for(int i=0; i<n; i++)
			{
				//left part- printing Stars
				for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
				//Mid part- printing Spaces
					for(int j=0; j<2*(n-i-1); j++)
					{
						System.out.print(" ");
					}
				//right part- printing Stars Again
				for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
				System.out.println();
			}

		//lower part
		for(int i=n; i>0; i--)
			{
				//left part- prining Stars
				for(int j=0; j<i; j++)
					{
						System.out.print("*");
					}
				//Mid part- printing Spaces
				for(int j=0; j<2*(n-i); j++)
					{
						System.out.print(" ");
					}
				//Right part- printing Stars Again
				for(int j=0; j<i; j++)
					{
						System.out.print("*");
					}
				System.out.println();
				
			}
	}
}
