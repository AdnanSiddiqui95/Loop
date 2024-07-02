import java.util.Scanner;
public class PatternOne4 
{
	//INVERTED LEFT HALF PYRAMID
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Rows for your pattern  : ");
		int n=sc.nextInt();
		for(int r=n;r>=1;r--)
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
