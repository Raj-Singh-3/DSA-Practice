public class PrintLinearlyfrom1ToN {
    public static void main(String[] args) {
        helper(10);
    }
    public static void helper(int n){
        if(n == 0 ) return;
        helper(n - 1);
        System.out.print(n+" ");
    }

}
