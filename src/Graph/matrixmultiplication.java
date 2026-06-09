package Graph;
import java.util.*;
public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int[][]nums1=new int[n][m];
        int[][]nums2=new int[p][q];
        if(m!=p) System.out.println("Ni Hone Ka");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                nums2[i][j]=sc.nextInt();
            }
        }

    }
}
