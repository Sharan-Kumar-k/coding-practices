import java.util.Scanner;
class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, result = 0;

        if (n == 1) result = a;
        else if (n == 2) result = b;
        else {
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }

        System.out.println("Nth Fibonacci: " + result);
    }
}
