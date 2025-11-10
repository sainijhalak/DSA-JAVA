import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // Original number
        int k = sc.nextInt();      // Number of digits to move to front
        int count = 0;
        int num = n;               // Save original number

        // Count number of digits
        while (n > 0) {
            n = n / 10;
            count++;
        }

        // Extract last k digits
        int z = (int)Math.pow(10, k);
        int r = num % z;

        // Remaining front part
        int m = num / z;

        // Compute 10^(count - k)
        int a = count - k;
        int p = (int)Math.pow(10, a);

        // Move last k digits to front
        int g = r * p + m;

        System.out.println(g);     // Final output
    }
}

