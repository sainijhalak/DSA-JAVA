import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
int sp=0;

        for(int i=1;i<=n;i++){
           for (int j=0;j<sp;j++){
               System.out.print("\t");
           }
            System.out.print("*\t");
sp=i;
            System.out.println();
        }
    }
}
