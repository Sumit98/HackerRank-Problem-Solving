import java.util.Scanner;

public class projecteuler03 {

	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);
		    int t = in.nextInt();
		    int k=0;
		    while(t!=0)
		    {
		    	int[] x=new int[10000];
		    	 int n = in.nextInt();
		    	 for(int i=2;i<n;i++)
		    	 {
		    		 while(n%i==0)
		    		 {
		    			 x[k]=i;
		    			 System.out.println(i);
		    			 n=n/i;
		    			 k++;
		    		 }
		    	 }
		    	 System.out.println(x);
		    	 t--;
		    }
	}

}
