package com.domain.Enrty;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * 코딩테스트 입문
 * 최빈값 구하기
 *
 */
public class Find_Most_Frequency {
    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 3, 3, 4};
        int[] case2 = {1, 1, 2, 2};
        int[] case3 = {1};
        System.out.println(solution(case1));
        System.out.println(solution(case2));
        System.out.println(solution(case3));
    }

    public static int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : array) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for(int num : count.keySet()) {
            if(count.get(num) > maxFrequency){
                maxFrequency = count.get(num);
                answer = num;
            } else if (count.get(num) == maxFrequency) {
                answer = -1;
            }
        }

        return answer;
    }

//    public static int solution(int[] array) {
//        final int[] answer = {0};
//        Map<Integer, Integer> count = new HashMap<>();
//
//        for (int num : array) {
//            count.put(num, count.getOrDefault(num, 0) + 1);
//        }
//
//        answer[0] = array[0];
//        final int[] maxFrequency = {count.get(array[0])};
//        count.forEach((k,v) -> {
//            if(v > maxFrequency[0]){
//                maxFrequency[0] = v;
//                answer[0] = k;
//            }else if(k != answer[0] && v == maxFrequency[0]){
//                answer[0] = -1;
//            }
//        });
//        return answer[0];
//    }
}