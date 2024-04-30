package java_basics;
import java.util.Scanner;



public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String character = "";
        char ch= sc.next().charAt(0);
        if(ch == Character.toUpperCase(ch)){
            System.out.println("Upper Case");
        } else {
            System.out.println("Lower Case");
        }

//
//        if (ch>='a' && ch<='z') {
//            System.out.println("lower case letter");
//        }
//        else if (ch>='A' && ch<='Z') {
//            System.out.println("upper case letter");
//        }
    }

}
