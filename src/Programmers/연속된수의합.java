package Programmers;

import java.util.Arrays;

public class 연속된수의합 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,15)));

    }


    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (total % num == 0) {
            for (int i = 0; i < num; i++) {
                answer[i] = total / num - (num / 2 - i);
            }
        } else {
            for (int i = 0; i < num; i++) {
                answer[i] = total / num - (num / 2 - i - 1);
            }
        }
        return answer;
    }

}
