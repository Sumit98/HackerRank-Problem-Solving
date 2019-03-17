import java.util.Scanner;

public class catandmouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int  n = in.nextInt();
		 while(n!=0)
		 {
			 int  x = in.nextInt();
			 int  y = in.nextInt();
			 int  z = in.nextInt();
			 if(Math.abs(x-z)>Math.abs(y-z))
			 {
				 System.out.println("Cat B"); 
			 }
			 else if(Math.abs(x-z)<Math.abs(y-z))
			 {
				 System.out.println("Cat A"); 
			 }
			 else
			 {
				 System.out.println("Mouse C"); 
			 }
			 n--;
		 }
		
	}

}
