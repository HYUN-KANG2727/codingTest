package com.domain.Enrty;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * 코딩테스트 입문
 * 중앙값 구하기
 *
 */
public class Middle_Vallue_Of_List {
    public static void main(String[] args) {
        int[] case1 = {1, 2, 7, 10, 11};
        int[] case2 = {9, -1, 0};
        System.out.println(solution(case1));
        System.out.println(solution(case2));
        System.out.println(Arrays.toString(exercise(case1)));
        System.out.println(Arrays.toString(exercise(case2)));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    // 배열 내림차순정렬하기
    public static int[] exercise(int[] array) {
        return
        Arrays.stream(array)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}