package Programmers.level1;

import java.util.Arrays;

public class 이상한문자만들기 {

    public static void main(String[] args) {
        String s = "try  hello  world";
        System.out.println((solution(s)));

    }
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }
}
    //s 를 공백으로 나눈다.
    //나눈 s[] 의 요소들에 공백들을 제거해준다.
    //s[] 의 요소 하나하나 마다 짝수인 요소를 대문자로 변환해준다.
    //s[] 의 요소들을 끝에 " " 를 더해서 합치고 마지막 요소에는 " "를 더하지 않는다.
