public class Main {
    public static void main(String[] args) {
        int a=3;
        int b=10;
        int c=0;
        
        c=a;
        a=b;
        b=c;

        // a=a+b;
        // b=a-b;
        // a=a-b;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}