package java_basics;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=7;
        int sum = 0;
        for(int i=1;i<=n-1;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }
}
