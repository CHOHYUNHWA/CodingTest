package Programmers.level1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        long answer = 0;
        double answerDouble = Math.ceil(Math.sqrt(n));
        System.out.println(n);
        System.out.println(answerDouble*answerDouble);
        if(n == answerDouble*answerDouble){
            answer = (long) ((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        } else {answer = -1;}
        return answer;
    }
}
