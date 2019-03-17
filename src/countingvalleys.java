import java.util.Scanner;

public class countingvalleys {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String s1;
		int n;
		int level = 0,valley=0;
		boolean belowSea = false;
		n=in.nextInt();in.nextLine();
		s1=in.nextLine();
		char ch;

		for(int i = 0; i < n; i++)
	        {
	            char slope = s1.charAt(i);
	            if(slope == 'U')
	                level++;
	            else
	                level--;
	            
	       
	          
				if(!belowSea && level < 0)
	            {
	                valley++;
	                belowSea = true;
	            }
	            
	            if(level >= 0)
	                belowSea = false;
	        }
	       System.out.println(valley); 
	}

}
