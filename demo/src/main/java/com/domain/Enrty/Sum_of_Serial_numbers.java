package com.domain.Enrty;

import java.util.Arrays;

/**
 *
 * 코딩테스트 입문
 * 연속된 수의 합
 *
 */
public class Sum_of_Serial_numbers {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3,12)));
        System.out.println(Arrays.toString(solution(5,15)));
        System.out.println(Arrays.toString(solution(4,14)));
        System.out.println(Arrays.toString(solution(5,5)));
        System.out.println(Arrays.toString(solution(99,0)));
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int i = -49; i < 1000; i++) {
            if(total == ((2*i + num-1) * num / 2)){
                for(int j = 0; j < num; j++ ){
                    answer[j] = i + j;
                }
                break;
            }
        }
        return answer;
    }

}