package com.example.algorithm.doit_algorithm_codingtest.투포인터;

import java.io.*;
public class 백준_2018_수들의_합_5 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.valueOf(br.readLine());
            int count = 0; //반환할 수

            for(int i = 1; i <= N; i++) {
                int n = i;
                int sum = 0;
                while(true) {
                    sum += n;
                    n++;
                    if(sum == N) {
                        count++;
                        break;
                    } else if(sum > N) { //sum이 N보다 커지면 중지
                        break;
                    }
                }
            }
            System.out.println(count);
        } catch(Exception e) {}
    }
}
