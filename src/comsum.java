import java.util.Scanner;
public class comsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] aar1=new int[n];
        for(int i=0;i<n;i++){
            aar1[i]=sc.nextInt();
        }
        System.out.println("-----");
        int[] aar2=new int[m];
        for(int i=0;i<m;i++){
            aar2[i]=sc.nextInt();
        }
        System.out.println("------------");
        int []sum =new int[n>m?n:m];
        int c=0;
        int i=n-1;
        int j=m-1;
        int k=sum.length-1;
while(k>=0){
    int d=c;
    if(i>=0){
        d+=aar1[i];
    }
    if(j>=0){
        d+=aar2[j];
    }
    c=d/10;
    d=d%10;
    sum[k]=d;

    i--;
    j--;
    k--;

}
if(c!=0){
    System.out.println(c);
}
for(int val:sum){
    System.out.println(val);
}
    }

}
