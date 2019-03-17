import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections; 

public class migratorybirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,c=1,k=0;
        n=in.nextInt();
		int[]a=new int[n];
		int[]types= {1,2,3,4,5};
		int[]b={0,0,0,0,0};
		for(int i = 0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
		for(int i = 0;i<5;i++)
        {
            b[a[i]]++;
        }
		for(int i = 0;i<5;i++)
        {
			  System.out.println(b[i]);
        }
		
		Arrays.sort(a);
		for(int i=0;i<5;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(types[i]==a[j])
					c++;	
			}
			if(c>1)
			{
				b[k]=c;
				k++;
			}
				
			c=1;		
		}
		  int max = Arrays.stream(b).max().getAsInt();
		  for(int i=0;i<6;i++)
          {
          if(b[i]==max)
              {
              System.out.println(i+1);
          break;
          }
	}

}
}
