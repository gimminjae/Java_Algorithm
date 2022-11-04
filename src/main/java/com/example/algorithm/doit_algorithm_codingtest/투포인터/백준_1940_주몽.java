package com.example.algorithm.doit_algorithm_codingtest.투포인터;

import java.util.*;
import java.io.*;
public class 백준_1940_주몽 {
    public static void main(String[] args) {
        try {
            //필요한 객체 선언, 입력값 받기, 사용할 값, 배열 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.valueOf(br.readLine());
            int M = Integer.valueOf(br.readLine());
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) arr[i] = Integer.valueOf(st.nextToken());

            int start = 0;
            int end = N-1;

            //압력된 수 배열 정렬
            Arrays.sort(arr);

            while(true) {
                int sum = arr[start] + arr[end];
                if(sum == M) {
                    count++;
                    start++;
                    end--;
                } else if(sum < M) {
                    start++;
                } else if(sum > M) {
                    end--;
                }
                if(start >= end) break;
            }

            System.out.println(count);
        } catch(Exception e) {}
    }
}
