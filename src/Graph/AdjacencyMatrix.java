package Graph;
import java.util.*;
public class AdjacencyMatrix {
    public static void main(String[] args) {

        int n=4;
        List<List<Integer>> list = List.of(
                List.of(0, 1),
                List.of(1, 2),
                List.of(3, 2),
                List.of(2, 0)
        );
//        int n = sc.nextInt(); // number of rows
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        for(int i = 0; i < n; i++) {
//            List<Integer> row = new ArrayList<>();
//
//            int m = sc.nextInt(); // is row mein kitne elements hain
//
//            for(int j = 0; j < m; j++) {
//                row.add(sc.nextInt());
//            }
//
//            list.add(row);
//        }

        int [][]mat=new int[n][n];
        for(int i=0;i< list.size();i++){

                int source=list.get(i).get(0);
                int destination=list.get(i).get(1);
                mat[source][destination]=1;
                mat[destination][source]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
