import java.util.Scanner;

public class bonapetite {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,c,k,sum=0;
        n=in.nextInt();
        c=in.nextInt();
		int[]a=new int[n];
		for(int i = 0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
		k=in.nextInt();
		for(int i = 0;i<n;i++)
		{
			if(a[i]!=a[c])
				sum=sum+a[i];
		}
		int pay=sum/2;
		if(k>pay)
			 System.out.println(k-pay);
		else
			 System.out.println("Bon Appetit");
			
	}

}
