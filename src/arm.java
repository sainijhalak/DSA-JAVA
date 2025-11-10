import java.util.Scanner;
public class arm {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(num==sum){
            System.out.println("armstrong");
        }
    }
}