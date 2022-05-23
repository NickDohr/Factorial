
public class Factorial
	{

		public static void main(String[] args)
			{
				fact(25);

			}

		public static void fact(int n)
		{
		int total = 0;
		while(n > 1)
			{
				 total = n * (n - 1);
				 n--;
			}
		 System.out.println(total);
		}
	}
