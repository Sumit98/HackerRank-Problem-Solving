import java.util.Arrays;
import java.util.Scanner;

public class hurdlerace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int max=0;
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i]=in.nextInt();
		
        for (int i = 1; i < x.length; i++) 
        {
        	 if (x[i] > max) 
                 max = x[i]; 
        }
        if(max>k)
        	 System.out.println(max-k);
        else
        	 System.out.println("0");
        	
           
	}

}
