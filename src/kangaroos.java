import java.util.Scanner;

public class kangaroos {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str="";
		int x1,x2,v1,v2;
		x1=in.nextInt();
		v1=in.nextInt();
		x2=in.nextInt();
		v2=in.nextInt();
		if(x2>x1&&v2>v1 ||  x1 > x2 && v1 > v2 || v1 == v2)
			 str="NO";
		else if (x1 == x2 && v1 == v2) 
			{
		        str="YES";
		    }
		else
		{
			str="YES";
		}
		

	}

}
