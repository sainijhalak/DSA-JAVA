import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int s=0;
        while(num>0){
            int r = num%10;
            s=s*10+r;
            num=num/10;

        }
        System.out.println(s);
    }
}
