package Programmers;

public class 숫자찾기 {
    public int solution(int num, int k) {
        int answer = 0;
        String tmp = Integer.toString(num);
            answer = tmp.indexOf(Integer.toString(k)) +1;
            if(tmp.indexOf(Integer.toString(k)) < 0 ){
                answer = -1;
            }
        return answer;
    }
}
