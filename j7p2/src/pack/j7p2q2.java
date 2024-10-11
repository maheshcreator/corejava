package pack;

public class j7p2q2 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{ 
			for(int k=n;k>i;k--) 
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("  * ");
			
		}
			System.out.println();

	}
		int m=n-1;
		for(int i=m;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("  * ");
			}
		System.out.println();
		
				
	}

		
		
	}
}



