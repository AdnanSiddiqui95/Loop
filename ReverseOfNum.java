import java.util.Scanner;
public class ReverseOfNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number: ");
		int num=sc.nextInt();
		int rem=0,dig;
		while(num!=0)
		{
			dig=num%10;
			rem=rem*10+dig;
			num=num/10;
		}
		System.out.println(rem);
	}

}
