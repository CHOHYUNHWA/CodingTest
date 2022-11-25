package Programmers;

import java.util.Arrays;

public class 최댓값만들기_투 {
    public static void main(String[] args) {
        System.out.println(new int[]{1,2,-3,4,-5,-2});
    }
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i]*numbers[j] > answer){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        return answer;
    }
}