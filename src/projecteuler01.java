import java.util.Scanner;
// Getting Timeout on 2 Test Cases
public class projecteuler01 {

	public static void main(String[] args)
	{
	  Scanner in = new Scanner(System.in);
		int t,n;
		t=in.nextInt();
		//n=in.nextInt();
		while(t!=0)
		{
			int sum=0;
			n=in.nextInt();
			for(int i=1;i<n;i++)
			{
				if(i%3==0||i%5==0) {
					sum+=i;
				}
			}
			  System.out.println(sum);
			  t--;
		}
				
		

	}

}
