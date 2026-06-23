package Recursion;
import java.util.*;
public class SumOfNaturalNumber { 
    static int sum(int n,int ss){
        if(n==0){
            return ss;
        }
        return sum(n-1,ss+n);
    }
    public static void main(String[] args) {
        int n=5;
        int ss=0;
        int s=sum(n,ss);
        System.out.println(s);
    }
}
