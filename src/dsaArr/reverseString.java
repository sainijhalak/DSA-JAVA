package dsaArr;

public class reverseString {
    public static StringBuilder sR(StringBuilder sb, int low, int high){
        if(low>=high) {
            return  sb;
        }
        char temp=sb.charAt(low);
        sb.setCharAt(low,sb.charAt(high));
        sb.setCharAt(high,temp);
        return sR( sb,low+1,high-1);
    }
    public static void main(String[] args) {
        String s="JHALAK";
        int low=0;
        int high=s.length()-1;
        StringBuilder sb=new StringBuilder(s);
        StringBuilder ans = sR(sb,low,high);

        System.out.println(ans);

    }
}
