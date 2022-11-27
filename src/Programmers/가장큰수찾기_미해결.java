package Programmers;

import java.util.Arrays;

public class 가장큰수찾기_미해결 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,8,3}));
    }
    public static int[] solution(int[] array) {
        int[] answer = {0, 0};
        int[] tmp = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        Arrays.sort(tmp);
        answer[0] = array[tmp.length - 1];
        for(int i =0; i < array.length; i++){
            if(answer[0] == array[i]){
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}

