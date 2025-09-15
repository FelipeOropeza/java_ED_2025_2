import java.util.Scanner;

public class Main {

    public static int fatorial(int n) {
         if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1); 5
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fatorial(n);
        System.out.println(result);
    }
}