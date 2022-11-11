package Programmers;

import java.util.Arrays;

public class 칠의개수 {
    public static void main(String[] args) {
        System.out.println(solution((new int[]{1,2,3,4})));
    }

    public static int solution(int[] array) {
        String tmp ="";
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            tmp += Integer.toString(array[i]);
        }
        for(int i=0; i<tmp.length(); i++){
            if(tmp.charAt(i) == '7'){
                answer++;
            }
        }
        return answer;
    }
}

