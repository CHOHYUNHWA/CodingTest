package Programmers;

import java.util.Arrays;

public class 문자열정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
    }
    public static int[] solution(String my_string) {
        int[] answer = {};
        my_string = my_string.replaceAll("[A-Za-z]","");
        answer = new int[my_string.length()];
        for(int i=0; i<answer.length; i++){
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }
}

