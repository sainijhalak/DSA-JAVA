public class freq {
    public static void main(String[] args) {
        int [] arr={1,2,2,2,3,4,4,4,4,6,6,7};
        int max = arr[0]; // assume first element is max

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
