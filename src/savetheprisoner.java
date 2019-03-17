import java.io.*;
import java.util.*;

public class savetheprisoner {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++)
        {
            int N = in.nextInt();
            int M = in.nextInt();
            int S = in.nextInt();
            
            int p = (S + M - 1) % N;
            if(p == 0)
            	p=N;
            
            System.out.println(p);
        }
    }
}