package DSA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("welcome to the Calculator");
        int res=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operator");
            char operator = sc.next().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println("enter the first number");
                int a = sc.nextInt();
                System.out.println("enter the second number");
                int b = sc.nextInt();

                if (operator == '+'){
                    res = a+b;
                }
                else if (operator == '-'){
                    res = a-b;
                }
                else if (operator == '*'){
                    res = a*b;
                }
                else if (operator == '/'){
                    if(b !=0){
                        res = a/b;
                    }
                }
            }
            System.out.println(res + " is the result of the given operation " );
        }
    }
}
