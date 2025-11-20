class Solution {
    public int longestKSubstr(String s, int k) {

        if (k == 0)
            return -1;   // no possible substring

        int[] freq = new int[256];
        int n = s.length();
        int low = 0;
        int distinct = 0;
        int res = -1;

        for (int high = 0; high < n; high++) {

            char ch = s.charAt(high);

            // add character
            freq[ch]++;
            if (freq[ch] == 1)
                distinct++;

            // shrink window
            while (distinct > k) {
                char left = s.charAt(low);

                freq[left]--;
                if (freq[left] == 0)
                    distinct--;

                low++;
            }

            // valid window
            if (distinct == k) {
                res = Math.max(res, high - low + 1);
            }
        }

        return res;
    }
}
public class longestsubstringkdistict {
    public static void main(String[] args) {
        Solution sc=new Solution();
       String s = "aabacbebebe";
       int k = 3;
       int res=sc.longestKSubstr(s,k);
        System.out.println(res);

    }
}