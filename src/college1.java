import java.util.Random;

public class college1 {


    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {5000, 10000, 20000, 40000, 80000};

        System.out.println("Input Size\tTime (ms)");
        for (int n : sizes) {
            int[] arr = generateRandomArray(n);

            long start = System.nanoTime();
            quickSort(arr, 0, n - 1);
            long end = System.nanoTime();

            long timeTaken = (end - start) / 1000000;
            System.out.println(n + "\t\t" + timeTaken);
        }
    }
}
