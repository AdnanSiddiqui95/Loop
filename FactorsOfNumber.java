import java.util.Scanner;
public class FactorsOfNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num=sc.nextInt();
		int h=num/2;
		System.out.println("factors are: 1");
		for(int n=2;n<=h;n++)
		{
			
			if(num%n==0)
				{
				System.out.println(n);	
				}
		}
		System.out.print(num);
		
	}
}