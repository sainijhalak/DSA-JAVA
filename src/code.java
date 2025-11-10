import java.util.Scanner;
public class code {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count=0;
        while(num>0){

            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
