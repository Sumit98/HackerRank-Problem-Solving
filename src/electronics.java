import java.util.Scanner;
import java.util.Arrays;

public class electronics {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int b,n,m,k=0,c=0;
	    b=in.nextInt();
		n=in.nextInt();
        m=in.nextInt();
		int[]key=new int[n];
		int[]usb= new int[m];
		int[]sum=new int [n*m];
		for(int i = 0;i<n;i++)
        {
            key[i]=in.nextInt();
        } 
		for(int i = 0;i<m;i++)
        {
			 usb[i]=in.nextInt();
        }
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				if(key[i]+usb[j]<b)
				{
					//System.out.println(key[i]+usb[j]);
					sum[k]=key[i]+usb[j];
					k++;
					c=1;
				}
			}
		}
		
		if(c==1) 
		{
			Arrays.sort(sum);
			  int max=sum[0];
			  for (int i = 0; i < sum.length; i++) 
			  {
				  if (sum[i] > max) 
				  {
					  max = sum[i]; 
				  }
		               
			  }
		            
			  System.out.println(max); 
		}
		else
		{
			for(int i = 0;i<n;i++)
			{
				for(int j = 0;j<m;j++)
				{
					if(key[i]+usb[j]>b)
					{
						System.out.println("-1"); 
					}
				}
			}
		}
		
	}

}
