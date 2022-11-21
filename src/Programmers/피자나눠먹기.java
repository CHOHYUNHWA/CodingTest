package Programmers;

public class 피자나눠먹기 {
    public static void main(String[] args) {

        System.out.println(solution(7,10));
    }

    public static int solution(int slice, int n) {
        int answer = 0;
        if(n%slice == 0){
            answer = n/slice;
        }
        if(n%slice != 0){
            answer = n/slice+1;
        }
        return answer;
    }
}

