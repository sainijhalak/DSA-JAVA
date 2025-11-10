import java.util.Scanner;
public class asum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] aar1=new int[n];
        int[] aar2=new int[n];
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            aar1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            aar2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum[i]=aar1[i]+aar2[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(sum[i]);
        }

    }

}
