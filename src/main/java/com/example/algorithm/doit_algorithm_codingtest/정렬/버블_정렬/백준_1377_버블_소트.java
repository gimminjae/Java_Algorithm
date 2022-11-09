package com.example.algorithm.doit_algorithm_codingtest.정렬.버블_정렬;

import java.util.*;
import java.io.*;
public class 백준_1377_버블_소트 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //필요한 데이터들 입력받기 및 생성
            int N = Integer.valueOf(br.readLine());
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < N; i++) list.add(Integer.valueOf(br.readLine()));
            List<Integer> sortedArr = list;
            Collections.sort(sortedArr);
            int max = 0;
            for(int i = 0; i < N; i++) {
                int n = list.get(i);
                int index = sortedArr.indexOf(n);
                max = Math.max(max, i - index);
            }
            System.out.println(max+1);
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
