import java.util.Scanner;
public class HelloSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int num = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        k = k % count;
        if (k < 0) {
            k = k + count;
        }


        int z = (int) Math.pow(10, k);
        int a = count - k;
        int p = (int) Math.pow(10, a);
        int r = num % z;
        int m = num / z;
        int g = r * p + m;
        System.out.println(g);

    }
}
