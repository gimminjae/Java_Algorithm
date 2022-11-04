package com.example.algorithm.doit_algorithm_codingtest.구간합;

import java.io.*;
import java.util.*;
public class 백준_11660_구간_합_구하기_5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.valueOf(st.nextToken());
            int t = Integer.valueOf(st.nextToken());

            long[][] numArr = new long[n][n];
            long[][] sumArr = new long[n+1][n+1];

            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                long sum = 0;
                for(int j = 0; j < n; j++) {
                    numArr[i][j] = Long.valueOf(st.nextToken());
                    sum += numArr[i][j];
                    sumArr[i+1][j+1] = sum;
                }
            }
            for(int i = 0; i < t; i++) {
                long result = 0;
                long sum = 0;
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.valueOf(st.nextToken());
                int y1 = Integer.valueOf(st.nextToken());
                int x2 = Integer.valueOf(st.nextToken());
                int y2 = Integer.valueOf(st.nextToken());
                for(int j = x1; j <= x2; j++) {
                    result += sumArr[j][y2] - sumArr[j][y1-1];
                }
                bw.write(result + "\n");
            }
            bw.flush();
        } catch(Exception e) {}
    }
}
