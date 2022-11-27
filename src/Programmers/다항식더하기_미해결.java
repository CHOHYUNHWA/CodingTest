package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 다항식더하기_미해결 {
    public String solution(String polynomial) {
        String answer = "";
        List<String> answerX = new ArrayList<String>();
        List<String> answerInt = new ArrayList<String>();
        String[] answerArray = answer.split(" ");
        for(int i = 0; i < answerArray.length; i++){
            answerArray[i].replace("+","");
        }
        for(int i = 0; i < answerArray.length; i++) {
            if (answerArray[i].charAt(answerArray[i].length() - 1) == 'x') {
                answerX.add(answerArray[i]);
            } else {
                answerInt.add(answerArray[i]);
            }
        }
        for(int i = 0; i < answerX.size(); i++){
            answerX.get(i).replace("x","");
        }
        for(int i = 0; i<answerX.size(); i++){

        }



        return answer;
    }
}

/*
1. polynomial 을 스트링 배열로 변환
2. 각각의 요소에 x가 있는지 검증
3. x요소는 요소끼리 더하고 숫자는 숫자끼리 더하고 리턴
 */
