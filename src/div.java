import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class div{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List <Integer> a = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a.add(i);

            }

        }
        System.out.println(a);
    }
}