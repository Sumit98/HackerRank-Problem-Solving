import java.util.Scanner;

public class projecteuler06 {

	public static void main(String[] args)
	{
		   int n,t;
		  Scanner in = new Scanner(System.in);
		  t = in.nextInt();
		  while(t!=0)
		  {
			  int sum=0,sq=0;
			  n = in.nextInt();
		        for(int i=1;i<=n;i++)
		        {
		        	sq=sq+(i*i);
		        	sum+=i;	
		        }
		      
		        int diff=(sum*sum)-sq;
		        System.out.println(diff);
		        t--;
		  }
	        

	}

}
