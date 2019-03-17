import java.util.Scanner;

public class divisiblesumpairs {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int n,k,c=0;
	        n=in.nextInt();
	        k=in.nextInt();
	        int[] a=new int[n];
	        
	        for(int i = 0;i<n;i++)
	        {
	            a[i]=in.nextInt();
	        }
	    
	       for(int i=0;i<n;i++)
	       {
	    	   for(int j=0;j<i;j++)
	    	   {
	    		   if((a[i]+a[j])%k==0)
	    			   c++;
	    	   }
	       }

	        System.out.println(c);
	}

}
