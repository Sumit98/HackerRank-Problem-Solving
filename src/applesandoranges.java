import java.util.Scanner;

public class applesandoranges {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int s,t,a,b,m,n;
		int ca = 0,co = 0;
		s=in.nextInt();
		t=in.nextInt();
		a=in.nextInt();
		b=in.nextInt();
		m=in.nextInt();
		n=in.nextInt();
		int[] app =new int [m];
		int[] ora =new int [n];
		for(int i = 0;i<m;i++)
		{
			app[i]=in.nextInt();
		}
		for(int i = 0;i<n;i++)
		{
			ora[i]=in.nextInt();
		}
		
		for(int i = 0;i<m;i++) {
			app[i]=app[i]+a;
		}
		for(int i = 0;i<n;i++) {
			ora[i]=ora[i]+b;
		}
		for(int i = 0;i<m;i++) {
			if(s<=app[i]&&app[i]<=t)
			{
				ca++;
			}
		}
		for(int i = 0;i<n;i++) {
			if(s<=ora[i]&&ora[i]<=t)
			{
				co++;
			}
		}
		 System.out.println(ca);
		 System.out.println(co);
		
		
		
		
		
	}

	
}