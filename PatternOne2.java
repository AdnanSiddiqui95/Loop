import java.util.Scanner;
public class PatternOne2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Ente any number to print pattern : ");
		int n=sc.nextInt();
		for(int r=1;r<=n;r++)
		{
			char ch=(char)(r+64);
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
