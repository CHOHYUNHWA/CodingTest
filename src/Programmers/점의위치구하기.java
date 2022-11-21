package Programmers;

public class 점의위치구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,4}));

    }

    public static int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }
        if(dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }
        if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }
        if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }
        return answer;
    }
}

