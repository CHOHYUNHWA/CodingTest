package Programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 케이의개수 {
    public static void main(String[] args) {
        System.out.println(solution(1,13,1));
    }
    public static int solution(int i, int j, int k) {
        int answer = 0;
        int start = i;
        int end = j;
        String tmp = "";
        List<Integer> intList = new ArrayList<>();
        for(int a = 0; a <= end-start; a++) {
            intList.add(i++);
        }

        for(int b = 0; b< intList.size(); b++) {
            tmp += Integer.toString(intList.get(b));
        }
        for(int c = 0; c< tmp.length(); c++) {
            if(Integer.toString(k).equals(String.valueOf(tmp.charAt(c)))){
                answer ++;
            }
        }
        return answer;
    }
}

//i 부터 j까지 배열로 나타낸다.
