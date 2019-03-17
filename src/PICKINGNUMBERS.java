import java.util.Scanner;
import java.util.Arrays;

public class PICKINGNUMBERS {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		int[] z=new int[n];
		for(int i=0;i<n;i++)
			x[i]=in.nextInt();
		Arrays.sort(x);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(x[j]-x[i])<=1)
				{
					++y[i];
				}
			}
		}
		 int max = Arrays.stream(y).max().getAsInt();
			System.out.println(max); 
	
	}

}
