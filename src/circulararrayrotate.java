import java.util.ArrayList;
import java.util.Scanner;
public class circulararrayrotate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		int n,k,q,x,id;
		 n = in.nextInt();
		 k = in.nextInt();
		 q = in.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 x = in.nextInt();
			 al.add(i, x);
		 }
		 int[] arr = new int[q];
		  for(int i=0;i<q;i++)
         {
			  arr[i]=in.nextInt();
         }
		   for(int i=0;i<k;i++)
			 {
				 x = al.get(n-1);
				 al.remove(al.size()-1);
				 al.add(0, x);
			 }
		 
		  for(int i=0;i<q;i++)
		  {
			  x=al.get(arr[i]);
			  System.out.println(x);
		  }


	}

}
