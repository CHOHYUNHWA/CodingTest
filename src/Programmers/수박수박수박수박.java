package Programmers;

public class 수박수박수박수박 {
    public static void main(String[] args) {
        int n =6;
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        char a = '수';
        char b = '박';
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer = answer + a;
            }
            if (i % 2 == 1) {
                answer = answer + b;
            }
        }
        return answer;
    }
}