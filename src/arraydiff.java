import java.util.Scanner;
public class arraydiff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a1=new int[n];
        int []a2=new int[m];
        for (int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for (int i=0;i<m;i++){
            a2[i]=sc.nextInt();
        }
        int []diff=new int[m];
        int i=n-1;
        int j=m-1;
        int c=0;
        int k=diff.length-1;
        while(k>=0){
            int d=0;
            int a1v=i>=0?a1[i]:0;
            if(a2[j]+c>=a1v){
                d=a2[j]+c-a1v;
                c=0;
            }
            else{
                d=a2[j]+c+10-a1v;
                c=-1;
            }
            diff[k]=d;
            i--;
            j--;
            k--;
        }
        for (int val:diff){
            System.out.println(val);
        }

    }
}
