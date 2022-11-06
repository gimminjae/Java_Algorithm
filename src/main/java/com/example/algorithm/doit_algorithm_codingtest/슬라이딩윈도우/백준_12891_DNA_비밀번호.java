package com.example.algorithm.doit_algorithm_codingtest.슬라이딩윈도우;

import java.util.*;
import java.io.*;
public class 백준_12891_DNA_비밀번호 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int S = Integer.valueOf(st.nextToken());
            int P = Integer.valueOf(st.nextToken());

            String DNA = br.readLine();

            st = new StringTokenizer(br.readLine());
            int A = Integer.valueOf(st.nextToken());
            int C = Integer.valueOf(st.nextToken());
            int G = Integer.valueOf(st.nextToken());
            int T = Integer.valueOf(st.nextToken());

            int count = 0;

            int start = 0;
            int end = P-1;

            int aCount = 0;
            int cCount = 0;
            int gCount = 0;
            int tCount = 0;

            for(int i = start; i <= end; i++) {
                char ch = DNA.charAt(i);

                if(ch == 'A') aCount++;
                if(ch == 'C') cCount++;
                if(ch == 'G') gCount++;
                if(ch == 'T') tCount++;
            }
            if(A <= aCount) {
                if(C <= cCount) {
                    if(G <= gCount) {
                        if(T <= tCount) count++;
                    }
                }
            }
            start++;
            end++;

            while(end != S) {
                char minusCh = DNA.charAt(start-1);
                if(minusCh == 'A') aCount--;
                if(minusCh == 'C') cCount--;
                if(minusCh == 'G') gCount--;
                if(minusCh == 'T') tCount--;

                char plusCh = DNA.charAt(end);
                if(plusCh == 'A') aCount++;
                if(plusCh == 'C') cCount++;
                if(plusCh == 'G') gCount++;
                if(plusCh == 'T') tCount++;

                if(A <= aCount) {
                    if(C <= cCount) {
                        if(G <= gCount) {
                            if(T <= tCount) count++;
                        }
                    }
                }
                start++;
                end++;
            }
            System.out.println(count);
        } catch(Exception e) {}
    }
}
