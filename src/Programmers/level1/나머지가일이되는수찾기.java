package Programmers.level1;

public class 나머지가일이되는수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}

