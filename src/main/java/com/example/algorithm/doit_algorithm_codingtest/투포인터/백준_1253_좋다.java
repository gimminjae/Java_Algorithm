package com.example.algorithm.doit_algorithm_codingtest.투포인터;

import java.io.*;
import java.util.*;
public class 백준_1253_좋다 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.valueOf(br.readLine()); //입력받는 수의 개수
            long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray(); //수를 저장할 배열 -> 스트림이용

            Arrays.sort(arr); //배열 정렬
            int count = 0;

            for(int i = 0; i < N; i++) {
                //더하는 값의 인덱스
                int start = 0;
                int end = N-1;

                //더한 값과 같아야 하는 값
                long n = arr[i];

                while(true) {
                    //더한 값
                    long sum = arr[start] + arr[end];

                    if(n == sum) {
                        if(start == i) {
                            start++;
                        } else if(end == i) {
                            end--;
                        } else {
                            count++;
                            break;
                        }
                    } else if(n > sum) {
                        start++;
                    } else if(n < sum) {
                        end--;
                    }
                    if(start == end) break;
                }
            }
            System.out.println(count);
        } catch(Exception e) {}
    }
}

