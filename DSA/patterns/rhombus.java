package DSA.patterns;

import java.util.Scanner;

public class rhombus {
    public static void triangle(int n){
        for(int i =0; i<n;i++){
            for(int j = 0; j <n- i -1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0; j <n- i -1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i =0; i<n;i++){
            for (int j = i; j >0 ; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n-i-1)+1; j++){
                System.out.print("*");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        triangle(x);
    }
}
