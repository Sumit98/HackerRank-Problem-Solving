import java.util.*;
public class timeconver {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
       String s[]=in.nextLine().split(":");
       String s1=s[0];
       int hrs=Integer.parseInt(s1);
       String s2=s[1];
       String s3=s[2].substring(0,2);
       String s4=s[2].substring(2,4);
       if(s4.equals("PM"))
       {
    	   if(!s1.equals("12"))
    	   {
    		   hrs=hrs+12;
    		   s1=Integer.toString(hrs);
    	   }
    		   
       }
       System.out.println(s1+":"+s2+":"+s3);
       
        
         
		
	}

}
