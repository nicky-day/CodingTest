package org.example.boj.array;

import java.io.*;

class 수_정렬하기_3 {
}

class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];

        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(br.readLine());
            arr[index]++;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
