package Programmers.level1;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        long x = 2;
        int n = 5;
        System.out.println(Arrays.toString(solution(x,n)));

    }
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i = 0 ; i<n; i++){
            if(x>0 || x<0) {
                answer[i] = x * (i + 1);
            } else {answer[i] = 0;}
        }
        return answer;
    }
}
