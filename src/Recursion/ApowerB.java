package Recursion;
import java.util.*;
public class ApowerB {
    static int powwer(int a,int b){
        if(b==0) return 1;
        return a*powwer(a,b-1);
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int ans=powwer(a,b);
        System.out.println(ans);
    }
}
