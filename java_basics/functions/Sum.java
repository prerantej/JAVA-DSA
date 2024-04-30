package java_basics.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum(2,3);
        usersum();
    }
    static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    static void usersum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
