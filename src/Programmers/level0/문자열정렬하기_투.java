package Programmers.level0;

import java.util.Arrays;

public class 문자열정렬하기_투 {
    public static void main(String[] args) {
        System.out.println(solution("Bcadds"));
    }
    public static String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        answer = new String(arr);
//        for(int i = 0; i < arr.length; i++) {
//            answer += arr[i];
//        }
        return answer;
    }
}
