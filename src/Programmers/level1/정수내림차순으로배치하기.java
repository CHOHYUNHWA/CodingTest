package Programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String tmp = Long.toString(n);
        char[] tmpArray = tmp.toCharArray();
        Arrays.sort(tmpArray);
        StringBuilder sb = new StringBuilder(String.valueOf(tmpArray));
        sb.reverse();
        String answerString = sb.toString();
//        System.out.println(answerString);
        long answer = Long.valueOf(answerString);

        return answer;
    }
}
