import java.util.Scanner;

public class angryprofessor {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t,n,k;
		 t = in.nextInt();
		 while(t!=0)
		 {
			 int c=0;
			 n = in.nextInt();
			 k = in.nextInt();
			 int[] arr = new int[n];
			  for(int i=0;i<n;i++)
	          {
				  arr[i]=in.nextInt();
	          }
			  for(int i=0;i<n;i++)
	          {
				 if(arr[i]<=0)
				 {
					 c++;
				 }
	          }
			  if(c<=k)
				  System.out.println("YES");
			  else
				  System.out.println("NO");
			 t--;
		 }
		
	
		
	}

}
