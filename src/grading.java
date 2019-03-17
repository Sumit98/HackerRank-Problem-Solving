import java.util.Scanner;

public class grading {
	public static void main(String[] args) {
		int n,x;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		int[] arr =new int [n];
		for(int i = 0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>38)
			{
				if(arr[i]%5>=3)
					arr[i]=arr[i]+((arr[i]%5)-1);
				// System.out.println(arr[i]);
			}
				
		}
		for(int i = 0;i<n;i++)
		{
			  System.out.println(arr[i]);
		}
		
	}

}
