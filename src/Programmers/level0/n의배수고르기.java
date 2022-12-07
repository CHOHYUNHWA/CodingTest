package Programmers.level0;

import java.util.ArrayList;

public class n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i]%n ==0){
                tmp.add(numlist[i]);
            }
        }
        answer = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++){
            answer[i] = tmp.get(i);
        }
        return answer;
    }
}