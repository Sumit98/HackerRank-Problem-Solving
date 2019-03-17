import java.util.Scanner;

public class designerpdfviewer {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int max=0;
		int[] x=new int[26];
		for(int i=0;i<26;i++)
		{
			x[i]=in.nextInt();
		}
		String word;
		in.nextLine();
		word=in.nextLine();
		int temp=0;
		for(int i=0;i<word.length();i++)
		{
			 
			if(temp < x[word.charAt(i)-97])
	            {                                   
	                 temp = x[word.charAt(i)-97];
	            }
				
					
		}
		 System.out.println(word.length()*temp);
			

	}

}
