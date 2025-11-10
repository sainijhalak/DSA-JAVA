import java.util.Scanner;
public class countdigit{
    public int countDigit(int x) {
        int count=0;

        while(x>0){
            x=x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        countdigit a=new countdigit();
       int res= a.countDigit(n);
        System.out.println(res);
    }
}
