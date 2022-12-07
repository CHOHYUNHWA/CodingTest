package Programmers.level0;

public class 개미군단 {
    public int solution(int hp) {
        int answer = 0;
        int tmp = 0;
        answer = hp/5;
        tmp = hp%5;
        answer += tmp/3;
        tmp = tmp%3;
        answer += tmp;

        return answer;
    }
}
