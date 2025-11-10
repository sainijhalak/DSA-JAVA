import java.util.Scanner;
public class patter14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            int s= i*n;
            System.out.println(n+"*"+i+"="+s);
        }
    }
}
