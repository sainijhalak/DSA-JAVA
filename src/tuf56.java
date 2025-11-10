import java.util.Scanner;
class tuf56 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i =0;i<n;i++){
for(int j=0;j<n-i;j++){
    System.out.print((j+1)+"\t");
}

            System.out.println();
        }
    }
}
