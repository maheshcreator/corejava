package pack;
public class J7p2q5 {
            public static void main(String[] args) {
		    int n=4;
for(int i=1;i<=n;i++){
			
	for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k>-i;k--)
			{
			if(k<0)
			{
				int v=k*-1+1;
				System.out.print(" "+v);
			}
			else if(k!=0)
			{
				System.out.print(" "+k);
			}}
			System.out.println();}
		    int m=n+1;
for(int i=m;i>=1;i--){
			
	for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k>-i;k--)
			{
			if(k<0)
			{
				int z=k*-1+1;
				System.out.print(" "+z);
			}
			else if(k!=0)
			{
				System.out.print(" "+k);
			}}
			System.out.println();}
}}
