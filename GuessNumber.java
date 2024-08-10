import java.util.Scanner;

public class GuessNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int num,guess,tries=0;
		num=(int)(Math.random()*10)+1;
		
		System.out.println("....Guess the Number GAME....");
		System.out.println();
		
		do
		{
			System.out.print("Enter your guess Number between 1 to 10 : ");
			guess=sc.nextInt();
			
			tries++;
			
			if(guess>num)
			{
				System.out.println("Too high!, try again");
			}
			else if(guess<num)
			{
				System.out.println("Too low!, try again");
			}
			else
			{
				System.out.println("Correct! You got it in "+tries+" gusses!");
			}
		}while(guess !=num);
	}
}
