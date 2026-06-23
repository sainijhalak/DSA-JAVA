package Recursion;
import java.util.*;
public class OneToN {
    void printN(int n){
        if(n==0) return;
        System.out.println(n);
        printN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        OneToN s=new OneToN();
        int n=5;
        s.printN(n);
    }
}
