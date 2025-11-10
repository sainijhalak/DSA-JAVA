import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int st=1;
        int sp=n;
        for (int i=1;i<n;i++){
            for (int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for (int j=1;j<=st;j++){


                System.out.print("*\t");

            }

//            System.out.println(st+","+sp+","+st);
st++;
sp=sp-2;

            System.out.println();
        }

    }
}
