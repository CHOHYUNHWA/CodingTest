package Programmers;

import java.util.Arrays;

public class 삼육구게임 {
    public int solution(int order) {
        int answer = 0;
        String tmp;
        tmp = Integer.toString(order);
        for (int i = 0; i < tmp.length(); i++) {
            if(Character.getNumericValue(tmp.charAt(i))%3 == 0 && Character.getNumericValue(tmp.charAt(i)) != 0){
                answer ++;
            }
        }
        return answer;
    }
}
