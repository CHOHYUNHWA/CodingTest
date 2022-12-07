package Programmers.level0;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(7));
    }
    public static int solution(int n) {
        int answer = 1;
        int count = 1;
        int tmp = 0;
        for(int i = 1; i < n; i++) {
            tmp = count*= i;
            if(n == tmp){
                answer = i;
                break;
            }
            if(n < tmp){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}
