package Programmers.level0;

import java.util.Arrays;

public class 삼각형의완성조건 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3}));
    }

    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]){
            answer= 1;
        }else answer =2;
        return answer;
    }
}

