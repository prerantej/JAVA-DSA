package java_basics;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // find the largest number out of these method 1//

       /*if(a>b && a>c){
            System.out.println(a + " is larger than " + b + " and " + c);
        }
        else if(b>a && b>c){
            System.out.println(b + " is larger than " + a + " and " + c);
        }
        else if(c>a && c>b){
            System.out.println(c + " is larger than " + a + " and " + b);
        }*/

        //method 2//
        int max= a;
        if(b>a){
            max=b;
        }
        else if(c>b){
            max=c;
        }
        System.out.println(max);
    }
}
