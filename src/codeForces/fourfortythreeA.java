package codeForces;

import java.util.*;

public class fourfortythreeA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set <Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) set.add(s.charAt(i));

        }
        System.out.print(set.size());
    }
}
