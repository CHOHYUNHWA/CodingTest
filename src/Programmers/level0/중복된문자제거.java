package Programmers.level0;


public class 중복된문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
    }
    public static String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i) answer += my_string.charAt(i);
        }
        return answer;
    }
}