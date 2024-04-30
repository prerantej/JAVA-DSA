package java_basics;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        float ctemp= sc.nextFloat();

        float ftemp = (float) ((ctemp * 1.8) + 32);
        System.out.println("Farenheit is " + ftemp);
    }

}
