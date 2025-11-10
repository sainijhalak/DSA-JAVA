public class rec2 {
    public static void printName(String n, int i){
       if(i==0){

           return;

       }
        System.out.println(n);
        printName(n,i-1);

    }

    public static void main(String[] args) {
        String n="hello World !";
    int i=5;
        printName(n,i);

    }
}
