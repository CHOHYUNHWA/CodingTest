package Programmers.level0;

public class 모음제거 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string
                .replace("a","")
                .replace("e","")
                .replace("i","")
                .replace("o","")
                .replace("u","");
        return answer;
    }
}
