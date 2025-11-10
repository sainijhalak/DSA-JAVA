import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr =new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=1;j<=arr[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
