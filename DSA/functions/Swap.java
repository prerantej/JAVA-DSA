package DSA.functions;

public class Swap {
    public static void main(String[] args) {
        swap(2,3);
    }
    static void swap(int a, int b) {
        System.out.println("a is equal to " + a);
        System.out.println("b is equal to " + b);
        int temp= a;
        a=b;
        b=temp;
        System.out.println("now a is equal to " + a);
        System.out.println("and b is equal to" + b);
    }
}
