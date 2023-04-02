package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

class Solution{
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answerList.add(arr[i]);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        if(answerList.size() == 0)
            return new int[]{-1};
        return answer;
    }
}
