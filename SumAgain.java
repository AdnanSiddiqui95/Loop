import java.util.Scanner;

public class SumAgain 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		char choice;
		do
		{
			System.out.print("Enter the Fist number : ");
			num1=sc.nextInt();
			
			System.out.print("Enter the Second number : ");
			num2=sc.nextInt();
			
			int sum=num1+num2;
			System.out.println("Sum of "+num1+" and "+num2+" :"+sum);
			
			System.out.print("Do you want to continue(enter y) or not(enter n): ");
			choice =sc.next().charAt(0);
			
			System.out.println();
		}
		while(choice == 'y' || choice =='n');
	}

}
