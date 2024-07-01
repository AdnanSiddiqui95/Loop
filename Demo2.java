
public class Demo2
{
	// code to generate  fibonacci series

	public static void main(String[] args)
	{
		int x=1,y=1,z;
		System.out.println(x);
		while(y<=30)
		{
			System.out.println(y);
			z=x+y;
			x=y;
			y=z;
		}

	}

}
