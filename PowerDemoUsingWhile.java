import java.util.Scanner;
public class PowerDemoUsingWhile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int base;
        int power;
        int result = 1;
        
        System.out.print("Enter the base number ");
        base = sc.nextInt();
        
        System.out.print("Enter the power ");
        power = sc.nextInt();

        while(power!=0)
        {
	    result *= base;
	    power--;
        }

        System.out.println("Result: "+ result);
    }
}
