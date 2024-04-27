package java_basics;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse ");
        int n = sc.nextInt();
        int reversed = 0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            reversed=reversed*10+rem;
        }
        System.out.println(reversed);
    }
}
