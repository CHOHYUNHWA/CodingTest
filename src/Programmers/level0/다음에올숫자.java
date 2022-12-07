package Programmers.level0;

public class 다음에올숫자 {
    public static void main(String[] args) {
        long[] common = {0, 2, 4};
        System.out.println(solution(common));
    }

    public static long solution(long[] common) {
        long answer = 0;
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length-1] + (common[1]-common[0]);
        }
       else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        return answer;
    }
}

