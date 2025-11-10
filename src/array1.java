import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the no.to be found");
        int x=sc.nextInt();
        System.out.println("--------");
        int[]arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("--------");
        int idx=-1;
        for (int i=0;i<n;i++){
            if(arr[i]==x){
                idx=1;
            }

        }
        System.out.println(idx);



    }
}
