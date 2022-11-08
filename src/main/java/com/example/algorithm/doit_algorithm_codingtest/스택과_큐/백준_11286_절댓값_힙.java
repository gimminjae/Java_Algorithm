package com.example.algorithm.doit_algorithm_codingtest.스택과_큐;

import java.util.*;
import java.io.*;

public class 백준_11286_절댓값_힙 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //명령어 개수 입력받기
            int N = Integer.valueOf(br.readLine());

            //문제의 기준에 부합하도록 조건을 맞춘 우선순위 큐 구현
            PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
                int absO1 = Math.abs(o1);
                int absO2 = Math.abs(o2);
                if(absO1 == absO2) {
                    return o1 > o2 ? 1 : -1;
                } else {
                    return absO1 - absO2;
                }
            });

            //명령 실행
            for(int i = 0; i < N; i++) {
                int n = Integer.valueOf(br.readLine());

                if(n == 0) {
                    if(heap.isEmpty()) {
                        bw.write(0 + "\n");
                        continue;
                    }
                    bw.write(heap.poll() + "\n");
                } else {
                    heap.add(n);
                }
            }
            bw.flush();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
