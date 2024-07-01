import java.util.Scanner;
public class PrimeNumber 
{
	// PRIEM NUMBER CODE
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		// Using FLAG VERIABLE
		int c=0;
		int s=0;
		if(num%2==0)
		{
			System.out.println("not a prime number");
		}
		else 
		{
			int sr=(int)Math.sqrt(num);
			for(int ctr=3;ctr<=sr;ctr+=2)
			{
				s++;
				if(num%ctr==0)
				{
					c=1;
					System.out.println("not a prime number");
					break;
				}
			
			}//END OF LOOP
			if(c==0)
			{
				System.out.println("Number is prime");
			}
			System.out.println("total: "+s);
		}
		

	}

}
