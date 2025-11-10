import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
int i;

        int n2 = sc.nextInt();
        for ( i = n2; i >= 0; i--) {
            if (n1 % i == 0 && n2%i==0) {
                System.out.println(i);
                break;}

        }
        int r= (n1*n2)/i;
        System.out.println("LCM"+r);





        }
    }
