package com.domain.Enrty;

/**
 *
 * 코딩테스트 입문
 * 옹알이
 *
 */
public class ONG_AL_YEE {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));

    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] canDo = {"aya", "ye", "woo", "ma"};
        for (String word : babbling) {
            String newWord = word;
            for(String canDoWord : canDo) {
                if(newWord.length() > 1){
                    newWord = newWord.replace(canDoWord, " ");
                }
            }
            if(newWord.trim().isEmpty()){
                answer ++;
            }
        }
        return answer;
    }

}