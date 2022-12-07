package Programmers.level0;

public class 제곱수판별하기 {
    public int solution(int n) {
        int answer = 0;
        Double sqrt = Math.sqrt(n);
        if(sqrt.intValue() == sqrt){
            answer =1;
        }else answer =2;
        return answer;
    }
}
