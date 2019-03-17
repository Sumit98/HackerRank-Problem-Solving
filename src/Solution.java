import java.util.*;
import java.util.Arrays;
import java.io.*;



class Solution{
    public static void main(String []args)
    {
          Scanner in = new Scanner(System.in);
         // int n = in.nextInt();
        //  int m = in.nextInt();
          int[][] arr = new int[3][3];
          for(int i=0; i<3; i++)
          {
              for(int j=0; j<3; j++)
              {
                  arr[i][j] = in.nextInt();
              }
          }
           int sum1=0,sum2=0;
           for(int i=0;i<3;i++)
           {
              sum1=sum1+arr[i][i];
           }
           for(int i=3-1;i>=0;i--)
           {
               for(int j=1;j<3;i++)
               {
                 sum2=sum2+arr[i][j];
               }
              
           }
          System.out.println(sum1);
          System.out.println(sum2);


          
    }
    
}

