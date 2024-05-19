package org.example.array.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            int finalI = i;
            int index = IntStream.range(0, nums.length)
                    .filter(j -> nums[j] == complement && j != finalI)
                    .findFirst()
                    .orElse(-1);
            if (index != -1) {
                return new int[]{i, index};
            }
        }
        return new int[0];
    }
}

class Main1 {
    public static void main(String[] args) {
        Two_Sum problem = new Two_Sum();
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(problem.twoSum(nums, target)));
    }
}
