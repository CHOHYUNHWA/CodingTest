package Programmers;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isUpperCase(my_string.charAt(i)) == true){
                answer += Character.toLowerCase(my_string.charAt(i));
            }
            if(Character.isLowerCase(my_string.charAt(i)) == true){
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
