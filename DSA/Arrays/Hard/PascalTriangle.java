package DSA.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);

            for (int j = 1; j < i; j++) {
                nextRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            nextRow.add(1);
            res.add(nextRow);
        }

        return res;
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numRows = 5; // Example input
        List<List<Integer>> triangle = pt.generate(numRows);

        // Print the Pascal's Triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
