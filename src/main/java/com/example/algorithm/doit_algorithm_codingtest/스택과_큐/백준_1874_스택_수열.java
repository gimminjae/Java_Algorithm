package com.example.algorithm.doit_algorithm_codingtest.스택과_큐;


import java.io.*;
import java.util.*;

public class 백준_1874_스택_수열 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //BufferedWriter 를 사용하면 출력초과가 난다. 이유는? StringBuilder 보다 안 좋은 것인가?
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder sb = new StringBuilder();
            int N = Integer.valueOf(br.readLine());

            Stack<Integer> stack = new Stack<>();

            boolean result = true;

            int lastN = 1;
            for (int j = 0; j < N; j++) {
                int n = Integer.valueOf(br.readLine());

                //입력받은 수까지 stack에 값 넣기
                for (int i = lastN; i <= n; i++) {
                    stack.push(i);
                    lastN++;
                    sb.append("+\n");
                }
                //만약 스택의 끝값과 주어진 값이 일치하지 않는다면 결과는 NO 이다.
                if (n != stack.peek()) {
                    result = false;
                    break;
                } else {
                    stack.pop();
                    sb.append("-\n");
                }
            }
            if (result) System.out.println(sb.toString());
            else System.out.println("NO");
        } catch (Exception e) {
            System.out.println("NO");
        }
    }
}