import java.util.*;
import java.lang.*;
import java.io.*;

public class Plaindrome_Number_Pyramid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
			{
				//printing Spaces
				for(int j=1; j<=n-i; j++)
					{
						System.out.print("  ");
					}
				//printing Numbers
					//1st part- till 1 i.e. from i to 1
				for(int j=i; j>0; j--)
					{
						System.out.print(j+" ");
					}
					//2nd part- from i to 2
				for(int j=2; j<=i; j++)
					{
						System.out.print(j+" ");
					}
				System.out.println();
			}
		
	}
}
