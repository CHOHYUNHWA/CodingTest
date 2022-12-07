package Programmers.level0;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {

    }

    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(height < array[i]){
                answer += 1;
            }
        }
        return answer;
    }
}
