package Programmers;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String tmp = Integer.toString(n);
        for(int i = 0; i < tmp.length(); i++) {
            answer += Character.getNumericValue(tmp.charAt(i));
        }
        return answer;
    }
}

