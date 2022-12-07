package Programmers.level0;

public class 배열자르기 {
    public static void main(String[] args) {

    }
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1 +1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i+num1];
        }
        return answer;
    }
}
//copyOfRange를 쓰면 편리하다.
