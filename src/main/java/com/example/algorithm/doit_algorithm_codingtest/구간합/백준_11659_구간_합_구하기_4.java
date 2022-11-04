package com.example.algorithm.doit_algorithm_codingtest.구간합;


import java.io.*;
import java.util.*;
public class 백준_11659_구간_합_구하기_4 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            //숫자가 들어간 일반 배열 numArr과 인덱스 0 ~ i까지의 합을 저장한 합배열 sumArr 선언 및 값 저장
            long[] numArr = new long[Integer.valueOf(st.nextToken())];
            long[] sumArr = new long[numArr.length];
            int t = Integer.valueOf(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long sum = 0;
            for (int i = 0; i < numArr.length; i++) {
                numArr[i] = Long.valueOf(st.nextToken());
                sum += numArr[i];
                sumArr[i] = sum;
            }

            //주어지는 범위 start ~ end까지의 합을 출력한다.(테스트케이스의 수 t만큼 반복)
            for (int i = 0; i < t; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.valueOf(st.nextToken());
                int end = Integer.valueOf(st.nextToken());

                if (start == 1) {
                    sum = sumArr[end - 1];
                } else {
                    sum = sumArr[end - 1] - sumArr[start - 2];
                }
                System.out.println(sum);
            }
        } catch (Exception e) {}
    }
}
