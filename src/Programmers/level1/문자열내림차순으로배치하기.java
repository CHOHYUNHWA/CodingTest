package Programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
        String answer = "";
        char[] answerList = s.toCharArray();
        Arrays.sort(answerList);
        answer = answerList.toString();
        return answer;
    }
}

