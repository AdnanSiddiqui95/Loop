
public class Pattern4to180 {

	public static void main(String[] args) {
		int n=5;
		for(int r=n;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print((char)(c+64));
			}
			System.out.println();
		}

	}

}
