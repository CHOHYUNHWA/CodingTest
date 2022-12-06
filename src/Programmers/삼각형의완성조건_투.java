package Programmers;

import java.util.ArrayList;
import java.util.List;

public class 삼각형의완성조건_투 {
    public int solution(int[] sides) {
//        List<Integer> answerList = new ArrayList<Integer>();
        int answer = 0;
        int max =0;
        int other = 0;
        if(sides[0]> sides[1]){
            max = sides[0];
            other = sides[1];
        } else {
            max = sides[1];
            other = sides[0];
        }
        answer += other;
        for(int i = 1; i < max+other; i++){
            if(i<max+other && i>max){
                answer++;
            }
        }
        return answer;
    }
}

//가장긴변이 나머지 두 변의 합보다 작아야함
//a,b,c
//