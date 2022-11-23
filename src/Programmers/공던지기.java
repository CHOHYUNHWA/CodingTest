package Programmers;

public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 1; i < k; i++) {
            answer = answer + 2;
            if(answer > numbers[numbers.length-1]){
                answer = answer - numbers[numbers.length-1];
            }
        }
        return answer;
    }
}

/*
수도코드
1~3~5~7 순서대로 만약 numbers 크기보다 커지면 - 마지막 숫자
(k-1)*2 % numbers.length+1;
 */

