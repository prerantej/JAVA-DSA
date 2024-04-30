package java_basics;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String palindrom = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            palindrom = palindrom + s.charAt(i);
    }
        if (palindrom.equals(s)) {
            System.out.println("yep a palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
}
