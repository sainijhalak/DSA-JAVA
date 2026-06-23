package BootCamp;
import java.util.*;
public class AnagramString {
    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String a=new String(c);
            if(!map.containsKey(a)){
                List<String>list=new ArrayList<>();
                list.add(s);
                map.put(a,list);

            }
            else{
                map.get(a).add(s);
            }
        }
        List<List<String>> ans=new ArrayList<>();
        for(String k: map.keySet()){
            List<String>list=map.get(k);
            ans.add(list);
        }
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
