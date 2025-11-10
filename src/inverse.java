import java.util.Scanner;
public class inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        int a=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            int z =(int)Math.pow(10,r-1);
             a=a+(z*count);
            count++;
        }
        System.out.println(a);
    }
}
