import java.util.Scanner;
public class pep4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sp=2;
        int st=3;
        for (int i=0;i<n;i++){
//            System.out.print(st+","+sp+","+st);
for (int j=0;j<st;j++){
    System.out.print("*\t");
}
            for (int j=0;j<sp;j++){
                System.out.print("\t");
            }
            for (int j=0;j<st;j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                st--;
                sp=sp+2;
            }
            else{
                st++;
                sp=sp-2;
            }

            System.out.println();
        }
    }
}