package com.domain.Enrty;

import java.util.Arrays;

/**
 *
 * 코딩테스트 입문
 * 배열
 *
 */
public class Double_List {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{7, 6, 8, 15})));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        answer = Arrays.stream(numbers).flatMap(item -> Arrays.stream(new int[]{item * 2})).toArray();
        for(int num : numbers) {
            num *= 2;
        }
        return answer;
    }
}