import java.util.Scanner;
public class factor 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num=sc.nextInt();
		int half=num/2;
		System.out.println(1);
		for(int ctr=2;ctr<=half;ctr++)
		{
			if(num%ctr==0)
			{
				System.out.println(ctr);
			}
		}System.out.println(num);
		

	}

}
