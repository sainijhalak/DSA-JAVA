import java.util.*;

public class recBinarySearch {

    static int binarySearch(int[] nums, int low, int high, int x) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (nums[mid] == x) {
            return mid;
        }

        if (x < nums[mid]) {
            return binarySearch(nums, low, mid - 1, x);
        } else {
            return binarySearch(nums, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 78, 54, 2};

        Arrays.sort(nums);

        int x = 54;

        int res = binarySearch(nums, 0, nums.length - 1, x);

        System.out.println("Found at index: " + res);
    }
}
