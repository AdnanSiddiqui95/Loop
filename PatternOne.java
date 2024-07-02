import java.util.Scanner;
public class PatternOne 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente any number to print pattern : ");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=n;c>=r;c--)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
