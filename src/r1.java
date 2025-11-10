import java.util.Scanner;
public class r1 {
  public void rec(int n,int i){

     if(i==n){
         System.out.println(n);
         return;
     }
      System.out.println(i);
     rec(n,i+1);
    }
// if(n>0){
//        rec(n-1);
//        System.out.println(n);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        r1 a = new r1();
      a.rec(n,1);

    }

}
