package Programmers.level0;

import java.util.ArrayList;

public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < num_list.length; i++) {
            list.add(num_list[num_list.length-1-i]);
        }
        for(int i =0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

