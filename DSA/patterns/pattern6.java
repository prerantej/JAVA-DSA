package DSA.patterns;

import java.util.Scanner;

public class pattern6 {
    public static void pattern6(int n){
        for( int i=0;i<n;i++){
            for( int j=n;j>i;j--){
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        pattern6(x);
    }
}
