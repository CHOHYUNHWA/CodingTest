package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 다항식더하기_미해결 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(Integer.parseInt("3+3"));
    }
    public static String solution(String polynomial) {
        String answer = "";
        List<String> answerList = new ArrayList<String>();
        String[] tmp = polynomial.split(" ");
        System.out.println(Arrays.toString(tmp));
        answerList.add(tmp[0]);
        for(int i= 0; i<tmp.length; i++) {
            if(tmp[i].equals("x")){
                tmp[i] = "1x";
            }
        }
        for(int i = 1; i < tmp.length-1; i++) {
            if(tmp[i].equals("+")){
                answerList.add(tmp[i]+tmp[i+1]);
            }
            if(tmp[i].equals("-")){
                answerList.add(tmp[i]+tmp[i+1]);
            }
        }
        System.out.println(answerList);
        return answer;
    }
}

/*
1. polynomial 을 스트링 배열로 변환
2. 각각의 요소에 x가 있는지 검증
3. x요소는 요소끼리 더하고 숫자는 숫자끼리 더하고 리턴
 */
