import java.util.*;
import java.lang.*;
import java.io.*;

public class HollowRhombus_pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
			{
				//1st part- printing spaces
				for(int j=0; j<n-i-1; j++)
					{
						System.out.print(" ");
					}

				//2nd part- printing stars
				for(int j=0; j<n; j++)
					{
						//if main condition for hollow rhombus statisfies, we print Stars
						if(i==0 || j==0 || i==n-1 || j==n-1) 
						{System.out.print("*");}
						//else we print space
						else
						{System.out.print(" ");}              
					}
				System.out.println();
			}
	}
}
