package Programmers;

public class 세균증식 {
    public long solution(int n, int t) {
        long answer = n;
        for(int i = 0; i < t; i++) {
            answer = answer*2;
        }
        return answer;
    }
}
