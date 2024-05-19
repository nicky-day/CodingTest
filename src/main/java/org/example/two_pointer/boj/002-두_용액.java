package org.example.two_pointer.boj;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

class 두_용액 {
}

// binary search
class Main2_1 {

    static int findNearestValue(int[] arr, int leftIndex, int rightIndex, int findValue) {
        int nearestValue = arr[leftIndex];
        int nearestDiff = Math.abs(findValue - nearestValue);
        int l = leftIndex + 1;
        int r = rightIndex;
        while (l <= r) {
            int m = (l + r) / 2;
            int diff = Math.abs(findValue - arr[m]);
            if (diff < nearestDiff) {
                nearestValue = arr[m];
                nearestDiff = diff;
            }
            if (arr[m] < findValue) l = m + 1;
            else if (arr[m] > findValue) r = m - 1;
            else return findValue;
        }
        return nearestValue;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int ansAbs = Math.abs(arr[0] + arr[1]);
        int ans1 = arr[0];
        int ans2 = arr[1];
        for (int i = 0; i < N - 1; i++) {
            int pairValue = findNearestValue(arr, i + 1, N - 1, -arr[i]);
            int sumAbs = Math.abs(arr[i] + pairValue);
            if (ansAbs > sumAbs) {
                ansAbs = sumAbs;
                ans1 = arr[i];
                ans2 = pairValue;
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}

// TreeSet
class Main2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int ansAbs = 2000000001;
        int ans1 = 0;
        int ans2 = 0;
        TreeSet<Integer> set = new TreeSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            Integer[] pairValues = {set.floor(-x), set.ceiling(-x)};
            for (Integer pairValue : pairValues) {
                if (pairValue == null) continue;
                int sumAbs = Math.abs(x + pairValue);
                if (ansAbs > sumAbs) {
                    ansAbs = sumAbs;
                    ans1 = x;
                    ans2 = pairValue;
                }
            }
            set.add(x);
        }
        bw.write(Math.min(ans1, ans2) + " " + Math.max(ans1, ans2));
        bw.flush();
    }
}

// Two Pointer 1
class Main2_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int leftIndex = 0;
        int rightIndex = N - 1;
        int ansLeftIndex = leftIndex;
        int ansRightIndex = rightIndex;
        int ansAbs = Math.abs(arr[leftIndex] + arr[rightIndex]);
        while (leftIndex < rightIndex) {
            int currentSum = arr[leftIndex] + arr[rightIndex];
            int currentAbs = Math.abs(currentSum);
            if (ansAbs > currentAbs) {
                ansAbs = currentAbs;
                ansLeftIndex = leftIndex;
                ansRightIndex = rightIndex;
            }
            if (currentSum > 0) rightIndex--;
            else leftIndex++;
        }
        bw.write(arr[ansLeftIndex] + " " + arr[ansRightIndex]);
        bw.flush();
    }
}

// Two Pointer 2
class Main2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int leftIndex = 0;
        int rightIndex = N - 1;
        int ansLeftIndex = leftIndex;
        int ansRightIndex = rightIndex;
        int ansAbs = Math.abs(arr[leftIndex] + arr[rightIndex]);
        for (int i = 0; i < rightIndex; i++) {
            int currentSum = arr[i] + arr[rightIndex];
            int currentAbs = Math.abs(currentSum);
            if (ansAbs > currentAbs) {
                ansAbs = currentAbs;
                ansLeftIndex = i;
                ansRightIndex = rightIndex;
            }
            while (currentSum > 0 && i < rightIndex - 1) {
                currentSum = arr[i] + arr[--rightIndex];
                currentAbs = Math.abs(currentSum);
                if (ansAbs > currentAbs) {
                    ansAbs = currentAbs;
                    ansLeftIndex = i;
                    ansRightIndex = rightIndex;
                }
            }
        }
        bw.write(arr[ansLeftIndex] + " " + arr[ansRightIndex]);
        bw.flush();
    }
}
