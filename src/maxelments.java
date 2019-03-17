import java.util.Arrays;
import java.util.Scanner;

public class maxelments {
	static void swap (int a,int b)
	{
		a=a+b-a;
		b=b+a-b;
	}

	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		int n,d;
		n=in.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=in.nextInt();
		int arr[]=Arrays.copyOf(arr1, n);
		 for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                }
	        int b=1,swap=0;
	        for (int i=0;i<n;i++)
	        {
	        	if(arr1[i]==arr[b])
	        		b++;
	        	else
	        		swap++;
	        }
	        System.out.println(swap); 
	};
}