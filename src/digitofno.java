import java.util.Scanner;
public class digitofno {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int count = 0;
        int number=num;
        while (number > 0) {

           number/=10;
            count++;
        }
        int c=count-1;
        System.out.println(c);

        for(int i=c;i>=0;i--){
            int a = (int)Math.pow(10, i);
           int na=num/a;
            System.out.println(na);
            num=num%a;
        }

    }}

