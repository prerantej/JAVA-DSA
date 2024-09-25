package DSA.Recursion;

public class PowXN {
    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (x == 1.0) return 1.0;
        if (x == -1.0 && n % 2 == 0) return 1.0;
        if (x == -1.0 && n % 2 != 0) return -1.0;
        if (x == 0.0) return 0.0;

        long exp = n;
        if (n < 0) {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) {
            if ((exp % 2) == 1) {
                result *= x;
            }
            x *= x;
            exp /= 2;
        }

        return result;
    }

}

