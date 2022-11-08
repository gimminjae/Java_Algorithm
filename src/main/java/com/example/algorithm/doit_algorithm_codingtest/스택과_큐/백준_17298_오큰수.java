package com.example.algorithm.doit_algorithm_codingtest.스택과_큐;

import java.util.*;
import java.io.*;
public class 백준_17298_오큰수 {
    public static void main(String[] args) {
        try {
            //필요한 값 입력받아 저장 및 선언
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //정답을 저장해 출력
            StringBuilder sb = new StringBuilder();

            //배열의 길이
            int N = Integer.valueOf(br.readLine());

            //입력받은 숫자 배열
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            //정답을 저장할 배열
            int[] result = new int[N];

            //인덱스를 저장할 스택
            Stack<Integer> stack = new Stack<>();

            //처음에는 스택에 값이 없으므로 초기값 0을 넣어줌
            stack.push(0);
            for(int i = 1; i < N; i++) {
                //스택의 top의 위치의 값과 새로 들어오는 값을 비교
                //top의 위치의 값이 더 크거나 같으면 새로 들어오는 값의 인덱스도 스택에 넣는다.
                if(arr[stack.peek()] >= arr[i]) {
                    stack.push(i);
                } else if(arr[stack.peek()] < arr[i]) {
                    //새로 들어오는 값이 더 크면 그 값이 오큰수가 된다.
                    while(!stack.isEmpty()) {
                        result[stack.pop()] = arr[i];
                        if(stack.isEmpty()) break;
                        if(arr[stack.peek()] >= arr[i]) {
                            break;
                        }
                    }
                }
                stack.push(i);
            }
            //스택에 남아있는 인덱스들은 오큰수가 없다.
            while(!stack.isEmpty()) result[stack.pop()] = -1;

            for(int n : result) sb.append(n + " ");
            System.out.println(sb);
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
