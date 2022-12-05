package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 한번만등장한문자_미해결 {
    public static void main(String[] args) {
        System.out.println(solution("abcd"));
    }
    public static String solution(String s) {
        String answer = "";
        List<String> answerList = new ArrayList<String>();
        String[] stringList = s.split("");
        Arrays.sort(stringList);
        for(int i = 0; i < stringList.length; i++) {
            if(!answerList.contains(stringList[i])){
                answerList.add(stringList[i]);
            }
        }
        for(int i = 0; i < answerList.size(); i++) {
            answer += answerList.get(i);
        }
        return answer;
    }
}
