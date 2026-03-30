package codeForces;

import java.util.Scanner;
public class one{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='-'&& s.charAt(i+1)=='.'){
                ans=ans+'1';
                i=i+2;
            }
            else if(s.charAt(i)=='-'&& s.charAt(i+1)=='-'){
                ans=ans+'2';
                i=i+2;
            }
            else{
                ans=ans+'0';
                i++;
            }
        }
        System.out.print(ans);
    }}
