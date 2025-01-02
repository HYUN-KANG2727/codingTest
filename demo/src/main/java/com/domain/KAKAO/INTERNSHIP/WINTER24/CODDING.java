package com.domain.KAKAO.INTERNSHIP.WINTER24;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 2024 KAKAO WINTER INTERNSHIP
 * 가장 많이 받은 선물
 *
 */
public class CODDING {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        String[] friends3= {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        String[] friends5 = {"a", "b", "c"};
        String[] gifts5 = {"a b"};

        if (solution(friends5, gifts5) == 2) {
            System.out.println("TEST 5 ::: EXPECT 3 ::: " + solution(friends5, gifts5));
        } else {
            System.err.println("TEST 5 ::: EXPECT 3 ::: " + solution(friends5, gifts5));
        }

    }

    public static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> historyCount = new HashMap<>();
        Map<String, Integer> jisoo = new HashMap<>();

        for(String gift : gifts){
            historyCount.put(gift, historyCount.getOrDefault(gift, 0) + 1);
        }
        for(String gift : gifts){
            String give = gift.split(" ")[0];
            String take = gift.split(" ")[1];
            jisoo.put(give, jisoo.getOrDefault(give, 0) + 1);
            jisoo.put(take, jisoo.getOrDefault(take, 0) - 1);
        }

        Map<String, Integer> nextMonthCount = new HashMap<>();
        for(String friend1 : friends){
            for(String friend2 : friends){
                if(!friend1.equals(friend2)){
                    int give = historyCount.getOrDefault(friend1 + " " + friend2, 0);
                    int take = historyCount.getOrDefault(friend2 + " " + friend1, 0);
                    if(give > take){
                        nextMonthCount.put(friend1, nextMonthCount.getOrDefault(friend1, 0) + 1);
                    }
                    if(give+take == 0 || give == take){
                        if(jisoo.getOrDefault(friend1,0)> jisoo.getOrDefault(friend2,0)) nextMonthCount.put(friend1, nextMonthCount.getOrDefault(friend1, 0) + 1);
                    }
                }
            }
        }

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        if(!nextMonthCount.isEmpty()){
            Map.Entry<String, Integer> max = Collections.max(nextMonthCount.entrySet(), comparator);
            answer = max.getValue();
        }


        return answer;

    }



}
