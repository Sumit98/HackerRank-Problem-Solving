import java.util.Scanner;

public class utopiantree
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		for (int i = 0; i < t; i++)
		{
			int n = scanner.nextInt();
			System.out.println(utopianTree(n));
		}
	}

	private static int utopianTree(int n)
	{
		int height = 1;
		for (int i = 0; i < n; i++)
		{
			if(i % 2 == 0)
			{
				height *= 2;
			}
			else
			{
				height += 1;
			}
		}
		return height;
	}
}