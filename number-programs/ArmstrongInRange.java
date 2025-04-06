import java.util.Scanner;
class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int temp = num, sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}
