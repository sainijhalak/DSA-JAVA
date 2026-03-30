package codeForces;

import java.util.Scanner;

public class threethirtynineA {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            int c1 = 0, c2 = 0, c3 = 0;

            for(char ch : s.toCharArray()){
                if(ch == '1') c1++;
                else if(ch == '2') c2++;
                else if(ch == '3') c3++;
            }

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < c1; i++) ans.append("1+");
            for(int i = 0; i < c2; i++) ans.append("2+");
            for(int i = 0; i < c3; i++) ans.append("3+");

            if(ans.length() > 0) ans.deleteCharAt(ans.length()-1);

            System.out.println(ans);
        }
    }