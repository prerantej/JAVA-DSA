package DSA.BinarySearch.Problems;

class floorSqrt {
    // Function to find the floor of the square root of a number
    long floorSqrt(long n) {
        long i = 0;
        long j = n;
        long ans = -1;

        while (i <= j) {
            long mid = i + (j - i) / 2;
            long val = mid * mid;
            if (val == n) {
                return mid;
            }
            if (val < n) {
                ans = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Create an instance of the floorSqrt class
        floorSqrt fs = new floorSqrt();

        // Test with a sample input
        long n = 26;

        // Calculate the floor of the square root
        long result = fs.floorSqrt(n);

        // Print the result
        System.out.println("The floor of the square root of " + n + " is: " + result);
    }
}
