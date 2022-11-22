package Programmers;

public class 숨어있는숫자의덧셈 {
    public int solution(String my_string) {
        int answer = 0;
        String temp = my_string.replaceAll("[A-Za-z]","");
        for(int i=0; i<temp.length(); i++) {
            answer += Character.getNumericValue(temp.charAt(i));
        }
        return answer;
    }
}
