package Programmers.level1;

import java.util.ArrayList;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }

    //테스트 케이스
    public static long solution(int a, int b) {
        ArrayList<Integer> answerList = new ArrayList<>();
        long answer = 0;
        if(a == b){
            return a;
        }
        int max = 0;
        int min = 0;
        if(a > b){
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        int i =0;
        while(i<= max - min){
            answerList.add(min + i);
            answer += answerList.get(i);
            i++;
        }
        return answer;
    }
}

