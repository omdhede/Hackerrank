import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scan.close();

        if (n >= 1 && n <= 100 ) {
            if (n % 2 == 0) {
                if (n <= 5) {
                    System.out.println("Not Weird");
                } else if (20 >= n) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }

            else {
                System.out.println("Weird");
            }
        }

    }
}