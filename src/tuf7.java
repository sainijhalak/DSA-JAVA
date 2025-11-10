//import java.util.Scanner;
//public class tuf7 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//    }
//}
import java.util.Scanner;
public class tuf7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int st=1;
        int sp=n-1;

for(int i=0;i<n;i++){
//    System.out.print(sp+","+st+","+(st-1));
    for(int j=0;j<sp;j++){
        System.out.print("\t");
    }
    for(int j=0;j<st;j++){
        System.out.print("*\t");
    }
    for(int j=0;j<st-1;j++){
        System.out.print("*\t");
    }

    st++;
    sp--;


    System.out.println();
}
    }
}
