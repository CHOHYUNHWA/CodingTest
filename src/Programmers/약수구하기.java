package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 약수구하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
    }

    public static int[] solution(int n) {
        int[] tmp = new int[n];
        int count =0;
        for(int i =1; i<=n; i++){
            if(n%i == 0){
                tmp[count++] = i;
            }
        }
        int[] answer= new int[count];
        for(int i=0; i<answer.length; i++){
                answer[i] = tmp[i];
        }
        return answer;
    }
}
