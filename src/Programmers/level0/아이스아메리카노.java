package Programmers.level0;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        System.out.println(solution(15000));
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
//        answer[1] = money%answer[0];
        answer[1] = money%5500;

        return answer;
    }
}


