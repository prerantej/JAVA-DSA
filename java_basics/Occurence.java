package java_basics;
import java.util.*;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number where you want to find the number of occurences ");
        int n = sc.nextInt();
        System.out.println("enter the number to find the occurences of it ");
        int x = sc.nextInt();
        int count=0;
        while(n>0){
            int rem = n%10;
            if(rem==x){
                count += 1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
