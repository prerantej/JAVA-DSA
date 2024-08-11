package java_basics.Arrays.Hard;

import java.util.HashMap;

public class presumXor {
    public int solve(int[] A, int n1, int B) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int precalc = 0;
        int count = 0;

        for (int i = 0; i < n1; i++) {
            precalc ^= A[i];
            int req = precalc ^ B;
            count += mpp.getOrDefault(req, 0);
            mpp.put(precalc, mpp.getOrDefault(precalc, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        presumXor solution = new presumXor();

        int[] A = {1, 2, 3, 4}; // Example array
        int n1 = A.length;     // Length of the array
        int B = 1;             // Example XOR value

        int result = solution.solve(A, n1, B);
        System.out.println("Result: " + result); // Output the result
    }
}
