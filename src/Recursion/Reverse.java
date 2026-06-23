package Recursion;
import java.util.*;
public class Reverse {
    static void rev(int n,int r){
        if(n==0) {
            System.out.println(r);
            return;
        }
        r=r*10+(n%10);
        rev(n/10,r);
    }
    public static void main(String[] args) {
        int n=1234;
        int r=0;
        rev(n,r);
    }
}
