package Programmers.level0;

import java.util.Arrays;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));

    }

    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        if(my_str.length()%n != 0){
            answer = new String[my_str.length()/n+1];
        } else {answer = new String[my_str.length()/n];}
        for(int i=0; i<answer.length; i++){
            if(my_str.length() < n){
                answer[i] = my_str;
                return answer;
            }
            answer[i] = my_str.substring(0,n);
            my_str = my_str.substring(n);
        }
        return answer;
    }
}


