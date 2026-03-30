package codeForces;
import java.util.*;
public class seveneightyfiveA {
//    Tetrahedron. Tetrahedron has 4 triangular faces.
//    Cube. Cube has 6 square faces.
//    Octahedron. Octahedron has 8 triangular faces.
//    Dodecahedron. Dodecahedron has 12 pentagonal faces.
//    Icosahedron. Icosahedron has 20 triangular faces.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            String s=sc.next();
            if(s.equals("Tetrahedron")) sum=sum+4;
            else if (s.equals("Octahedron")) {
                sum=sum+8;
            }

            else if (s.equals("Cube")) {
                sum=sum+6;
            }

            else if (s.equals("Dodecahedron")) {
                sum=sum+12;
            }
            else{
                sum=sum+20;
            }
        }
        System.out.println(sum);
    }
}
