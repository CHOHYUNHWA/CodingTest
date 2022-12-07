package Programmers.level0;

import java.util.Arrays;
import java.util.HashSet;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        System.out.println(solution("abcd"));
    }
    public static String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        String[] arr = s.split("");
        HashSet<String> set = new HashSet<String>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);
        Arrays.sort(arr);
        int[] intArr = new int[arr.length];
        for(int i = 0; i < tmp.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(tmp[i].equals(arr[j])){
                    intArr[j]++;
                }
            }
        }
        for(int i = 0; i< intArr.length; i++){
            if(intArr[i] == 1){
                answer += String.valueOf(arr[i]);
            }
        }
        return answer;
    }
}
