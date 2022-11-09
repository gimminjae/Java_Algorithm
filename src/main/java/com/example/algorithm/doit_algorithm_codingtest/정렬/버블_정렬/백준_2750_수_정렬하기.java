package com.example.algorithm.doit_algorithm_codingtest.정렬.버블_정렬;


import java.io.*;
import java.util.*;
public class 백준_2750_수_정렬하기 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.valueOf(br.readLine());

            int[] arr = new int[N];
            for(int i = 0; i < N; i++) arr[i] = Integer.valueOf(br.readLine());
            Arrays.sort(arr);
            //버블 정렬
//            for(int i = 0; i < N - 1; i++) {
//                for(int j = 0; j < N - 1 - i; j++) {
//                    if(arr[j] > arr[j + 1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }
            for(int i = 0; i < N; i++) System.out.println(arr[i]);
        } catch(Exception e) {}
    }
}