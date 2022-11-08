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

            while(deck.size() != 1) {
                    deck.poll();
                    deck.offer(deck.poll());
            }
            System.out.println(deck.poll());
        } catch(Exception e) {
            System.out.println("error");
        }
    }
}
