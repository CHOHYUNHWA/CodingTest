package Programmers;

import java.util.Arrays;

public class 에이로비만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh","hello"));
    }
    public static int solution(String before, String after) {
        int answer = 0;
        int count = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        for(int i = 0; i < beforeArr.length; i++){
            if(beforeArr[i].equals(afterArr[i])){
                count++;
            }
        }
        if(count == beforeArr.length){
            answer = 1;
        }
        return answer;
    }
}
