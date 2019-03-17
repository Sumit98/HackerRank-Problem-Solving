import java.util.Scanner;

public class birthdaychocolate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s,d,m,c = 0,sum=0;
        s=in.nextInt();
        int[] choc=new int[s];
        
        for(int i = 0;i<s;i++)
        {
            choc[i]=in.nextInt();
        }
        d=in.nextInt();
        m=in.nextInt();

        for(int i = 0; i <= s-m; i++)
        {
        	 for(int j=i,x=1;x<=m;x++, j++)
        	 {
        		 sum += choc[j];
        	 }

             if(sum == d)
             {
                 c++;
             }
        }
         
          
   

        System.out.println(c);
    }
}