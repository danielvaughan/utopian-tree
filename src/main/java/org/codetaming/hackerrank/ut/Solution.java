package org.codetaming.hackerrank.ut;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startingHeight = 1;
        int numTestCases = s.nextInt();
        int testCase = numTestCases;
        Solution solution = new Solution();
        while (testCase-- > 0) {
            int cycles = s.nextInt();
            System.out.println(solution.calculateHeight(startingHeight, cycles));
        }
    }

    public int calculateHeight(int height, int cycles) {
        for (int cycle = 1; cycle <= cycles; cycle++) height = ((cycle % 2) == 0) ? (height + 1) : (height * 2);
        return height;
    }
}