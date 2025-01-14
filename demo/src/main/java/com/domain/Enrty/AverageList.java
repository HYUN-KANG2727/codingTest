package com.domain.Enrty;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 *
 * 코딩테스트 입문
 * 배열의 평균값
 *
 */
public class AverageList {
    public static void main(String[] args) {
        int[] case1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] case2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println("it must be 5.5 ::: " + solution(case1));
        System.out.println("it must be 94.0 ::: " + solution(case2));
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        if(numbers != null && numbers.length > 0){
            OptionalDouble average = Arrays.stream(numbers).average();
            if(average.isPresent()){
                answer = average.getAsDouble();
            }
        }
        return answer;
    }

    public static double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

}