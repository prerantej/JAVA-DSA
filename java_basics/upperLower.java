package java_basics;
import java.util.*;
import java.util.Scanner;



public class upperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String character = "";
        char ch= sc.next().charAt(0);
        /*if(ch= character.toUpperCase(ch)){
            System.out.println("Upper Case");
        }*/

        if (ch>='a' && ch<='z') {
            System.out.println("lower case letter");
        }
        else if (ch>='A' && ch<='Z') {
            System.out.println("upper case letter");
        }
    }
}
