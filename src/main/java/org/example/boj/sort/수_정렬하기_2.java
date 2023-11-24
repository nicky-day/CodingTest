package org.example.boj.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class 수_정렬하기_2 {
}

class Main174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(arrayList);
        arrayList.forEach(arr -> {
            try {
                bw.write(arr + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bw.flush();
        bw.close();
    }
}
