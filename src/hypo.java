import java.util.Scanner;
public class hypo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int x=(int)Math.pow(a,2);

        int y=(int)Math.pow(b,2);

        int z=(int)Math.pow(c,2);

        if((x+y)==z || (y+z)==x || (x+z)==y){
            System.out.println(true);
        }
        else{
                System.out.println(false);}
        }



    }
