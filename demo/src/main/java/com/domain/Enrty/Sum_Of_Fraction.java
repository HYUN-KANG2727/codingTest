package com.domain.Enrty;

import java.util.Arrays;

/**
 *
 * 코딩테스트 입문
 * 분수의 덧셈
 *
 */
public class Sum_Of_Fraction {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(7, 6, 8, 15)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numerSum = numer1 * denom2 + numer2 * denom1;
        int denomSum = denom1 * denom2;
        int gcd = gcd(numerSum, denomSum);
        return new int[]{numerSum/gcd, denomSum/gcd};
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}