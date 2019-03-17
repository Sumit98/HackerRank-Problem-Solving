import java.util.Scanner;

public class beautifuldaysatmovies {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int i,j,k,diff,x=0;
		 i = in.nextInt();
		 j = in.nextInt();
		 k = in.nextInt();
		 diff=j-k;
		for(int v=i;v<=j;v++)
		{
			int reverse = Integer.parseInt(new StringBuilder(Integer.toString(v)).reverse().toString());
			if (Math.abs(v - reverse) % k == 0) {
                x++;
            }
		}
		  System.out.println(x);
		 
	}

}
