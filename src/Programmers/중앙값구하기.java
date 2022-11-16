package Programmers;

import java.util.Arrays;

public class 중앙값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {9,-1,0}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int answer = array[array.length/2];
        return answer;
    }
}
