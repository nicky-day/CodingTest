package org.example.stack.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

class 오큰수 {
}

class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ans = new int[N];
        int[] descendingSequence = new int[N];
        int sequenceIndex = -1;
        for (int i = N - 1; i >= 0; i--) {
            while (sequenceIndex >= 0 && descendingSequence[sequenceIndex] <= arr[i])
                sequenceIndex--;
            ans[i] = sequenceIndex < 0 ? -1 : descendingSequence[sequenceIndex];
            descendingSequence[++sequenceIndex] = arr[i];
        }

        System.out.println(Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList()));
    }
}
