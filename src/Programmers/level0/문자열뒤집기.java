package Programmers.level0;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
    }

    public static String solution(String my_string) {
        String answer = "";
        for(int i =0; i < my_string.length(); i++) {
            answer += my_string.charAt(my_string.length()-i-1);
        }
        return answer;
    }
}
