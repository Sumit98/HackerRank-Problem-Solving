import java.util.Scanner;

public class viraladvertising {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        double people = 2;
        int count  = 2;
        for (int i = 2; i <= n; i++) {
            people = Math.floor((people * 3) / 2);
            count += people;
        }
        System.out.println(count);
    }
}