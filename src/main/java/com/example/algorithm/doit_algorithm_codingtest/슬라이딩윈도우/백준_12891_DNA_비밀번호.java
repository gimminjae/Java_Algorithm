package com.example.algorithm.doit_algorithm_codingtest.슬라이딩윈도우;

import java.util.*;
import java.io.*;
public class 백준_12891_DNA_비밀번호 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            //필요한 입력값 받기
            int S = Integer.valueOf(st.nextToken());
            int P = Integer.valueOf(st.nextToken());

            String DNA = br.readLine();

            st = new StringTokenizer(br.readLine());
            int A = Integer.valueOf(st.nextToken());
            int C = Integer.valueOf(st.nextToken());
            int G = Integer.valueOf(st.nextToken());
            int T = Integer.valueOf(st.nextToken());

            //필요한 값 선언
            int count = 0;

            int start = 0;
            int end = P-1;

            int aCount = 0;
            int cCount = 0;
            int gCount = 0;
            int tCount = 0;

            //초기 문자열 범위의 문자 개수 파악
            for(int i = start; i <= end; i++) {
                char ch = DNA.charAt(i);

                if(ch == 'A') aCount++;
                if(ch == 'C') cCount++;
                if(ch == 'G') gCount++;
                if(ch == 'T') tCount++;
            }

            //검증
            if(A <= aCount) {
                if(C <= cCount) {
                    if(G <= gCount) {
                        if(T <= tCount) count++;
                    }
                }
            }

            //범위 1증가
            start++;
            end++;


            while(end != S) { //범위의 끝 인덱스인 end가 문자열S의 길이와 같아지면 break
                //범위 한 칸을 이동하면 처음과 끝을 제외한 그 안의 값들은 전과 같다.
                //따라서 변한 처음의 값과 끝의 값만 파악하여 반영하면 된다
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

                //검증
                if(A <= aCount) {
                    if(C <= cCount) {
                        if(G <= gCount) {
                            if(T <= tCount) count++;
                        }
                    }
                }
                //범위 1증가
                start++;
                end++;
            }
            //답 출력
            System.out.println(count);
        } catch(Exception e) {}
    }
}
