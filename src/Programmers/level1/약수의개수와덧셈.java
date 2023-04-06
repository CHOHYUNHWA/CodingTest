package Programmers.level1;

public class 약수의개수와덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; left<=right; left++){
            int tmp = 0;
            for(int j=1; j<=left; j++){
                if(left%j == 0){
                    tmp++;
                }
            }
            if(tmp%2 == 0){
                answer += left;
            }else {answer -= left;}
        }
        return answer;
    }
}

