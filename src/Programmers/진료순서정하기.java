package Programmers;

import java.util.Arrays;

public class 진료순서정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
    }
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int count = emergency.length;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(emergency[i] > emergency[j]){
                    count--;
                    }
                answer[i] = count;
                }
            count = emergency.length;
            }
        return answer;
    }
}
