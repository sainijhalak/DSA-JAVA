package BootCamp;
import java.util.*;
public class CommonElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[]arr1=new int[n1];
        for(int i=0;i<n1;i++){
             arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[]arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int n3=sc.nextInt();
        int[]arr3=new int[n3];
        for(int i=0;i<n3;i++){
            arr3[i]=sc.nextInt();
        }
        int i=0;
        int j=0;
        int k=0;
        List<Integer> list=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(arr1[i]==arr2[j] && arr2[j]==arr2[k]){
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(arr1[i]!=arr2[j] && arr1[i]!=arr3[k] && arr2[j]==arr3[k]){
                i++;
            }
            else if(arr2[j]!=arr1[i] && arr2[j]!=arr3[k]  && arr1[i]==arr3[k]){
                j++;
            }
            else{
                k++;
            }

        }
        System.out.println("answer");
        for(int m=0;m<list.size();m++){
            System.out.print(list.get(m));
        }
    }
}
