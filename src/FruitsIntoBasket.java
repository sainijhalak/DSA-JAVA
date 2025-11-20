import java.util.*;
class Solutio {
    public int totalFruit(int[] fruits) {

        int maxType = 50;                // assume fruit types are 0..50
        int[] freq = new int[maxType+1];

        int low = 0, distinct = 0, res = 0;

        for (int high = 0; high < fruits.length; high++) {

            int fruit = fruits[high];

            // add to window
            freq[fruit]++;
            if (freq[fruit] == 1) distinct++;   // new type entered window

            // shrink window
            while (distinct > 2) {
                int leftFruit = fruits[low];
                freq[leftFruit]--;
                if (freq[leftFruit] == 0) distinct--;  // type removed
                low++;
            }

            // valid window -> update max length
            res = Math.max(res, high - low + 1);
        }

        return res;
    }

}
public class FruitsIntoBasket {
    public static void main(String[] args) {
        int []fruits = {1,2,1};
        Solutio sc=new Solutio();
        int res=sc.totalFruit(fruits);
        System.out.println(res);
    }
}
