import java.util.*;
class diamond_pattern{
	public static void main(String[] args){
      
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//upper half
		for(int i=0; i<=n/2; i++)
			{
				//printing spaces
				for(int j=0; j<n/2-i; j++)
					{
						System.out.print("  ");
					}
				//printing stars
				for(int j=0; j<2*i+1; j++)
					{
						System.out.print("* ");
					}
				System.out.println();
			}
		//lower half
		for(int i=n/2-1; i>=0; i--)
			{
				//printing spaces
				for(int j=0; j<n/2-i; j++)
					{
						System.out.print("  ");
					}
				//printing stars
				for(int j=0; j<2*i+1; j++)
					{
						System.out.print("* ");
					}
				System.out.println();
			}

	}

}
