package com.domain.Enrty;

/**
 *
 * 코딩테스트 입문
 * 옷가게 할인 받기
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 */
public class DiscountClothes {
    public static void main(String[] args) {
        int case1 = 150000;
        int case2 = 580000;
        System.out.println("it must be 142500 ::: " + solution(case1));
        System.out.println("it must be 464000 ::: " + solution(case2));
    }

    public static int solution(int price) {
        int discount = 0;
        if (price >= 500000) {
            discount = 20;
        } else if (price >= 300000) {
            discount = 10;
        } else if (price >= 100000) {
            discount = 5;
        }
        return price*(100-discount)/100;
    }
}