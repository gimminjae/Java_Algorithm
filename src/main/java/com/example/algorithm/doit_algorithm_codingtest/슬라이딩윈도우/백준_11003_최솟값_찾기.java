package com.example.algorithm.doit_algorithm_codingtest.슬라이딩윈도우;

import java.util.*;
import java.io.*;
public class 백준_11003_최솟값_찾기 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //입력값 받기 밑 세팅
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.valueOf(st.nextToken());
            int L = Integer.valueOf(st.nextToken());

            String[] inputArr = br.readLine().split(" ");
            long[] arr = Arrays.stream(inputArr).mapToLong(Long::parseLong).toArray();
            long[] result = new long[arr.length];

            long min = arr[0];
            //초기 범위의 최솟값 구하기
            for(int i = 0; i < L; i++) if(arr[i] < min) min = arr[i];
            bw.write(min + " ");

            //i는 L부터 시작
            for(int i = L+1; i < L + arr.length; i++) {
//                if()
            }
        } catch(Exception e) {}
    }
}
