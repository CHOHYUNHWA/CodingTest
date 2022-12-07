package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        Integer[] dummy = new Integer[arr.length];
        for(int i =0; i<arr.length; i++){
            dummy[i] = arr[i];
        }
        int[] answer = new int[arr.length-1];
        Arrays.sort(dummy, Collections.reverseOrder() );
        if(arr.length == 0 || arr.length ==1){
            answer = new int[]{-1};
            return answer;
        }
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<dummy.length-1; j++){
                if(arr[i] == dummy[j]){
                    answerList.add(arr[i]);
                }
            }
        }
        answer = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}
