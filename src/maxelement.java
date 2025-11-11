import java.util.Scanner;
public class maxelement {
    public static void main(String[] args) {
        int [] arr={2,45,3,111,78,9};
        int max=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
