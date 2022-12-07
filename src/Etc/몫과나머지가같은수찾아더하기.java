package Etc;

public class 몫과나머지가같은수찾아더하기 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }


    public static long solution(long n){
        long answer = 0;
        for(int i=1; i<n+1; i++){
            if(i >= n){
                return answer;
            }
            answer += (n+1)*i;
        }
        return answer;
    }
}

