import java.util.Scanner;
public class PatternOne3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente any number to print pattern : ");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int s=n-r;s>=1;s--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
