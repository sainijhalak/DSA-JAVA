import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sp=n/2;
        int st=1;
        int no=1;

        for(int i=1;i<=n;i++){

            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int cval=no;
            for (int j=1;j<=st;j++){
                System.out.print(cval+"\t");

                if(j<=st/2){
cval++;
                }
                else{
                    cval--;
                }


            }

            if(i<=n/2){
                sp--;
                st+=2;
                no+=1;


            }
            else{
                sp++;
                st-=2;
                no-=1;

            }
            System.out.println();
        }
    }
}
