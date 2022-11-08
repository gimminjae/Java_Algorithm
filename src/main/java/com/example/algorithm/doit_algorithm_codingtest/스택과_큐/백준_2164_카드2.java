package com.example.algorithm.doit_algorithm_codingtest.스택과_큐;

import java.util.*;
import java.io.*;
public class 백준_2164_카드2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.valueOf(br.readLine());
            Queue<Integer> deck = new LinkedList<>();
            for(int i = 1; i <= N; i++) deck.offer(i);

            //꺼낸 값을 버리는지,다시 넣는지 여부
            boolean trash = true;
            while(deck.size() != 1) {
                if(trash) {
                    deck.poll();
                    trash = false;
                } else {
                    deck.offer(deck.poll());
                    trash = true;
                }
            }
            System.out.println(deck.poll());
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
