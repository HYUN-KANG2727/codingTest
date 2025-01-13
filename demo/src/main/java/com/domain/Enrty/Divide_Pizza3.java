package com.domain.Enrty;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * 코딩테스트 입문
 * 피자 나눠 먹기 (3)
 *
 */
public class Divide_Pizza3 {
    public static void main(String[] args) {
        System.out.println(solution(7,10));
        System.out.println(solution(4,12));
    }

    public static int solution(int slice, int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n <= slice * i){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public int solution2(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }
}