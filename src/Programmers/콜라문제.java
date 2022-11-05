package Programmers;

public class 콜라문제 {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
    }

    public static int solution(int a, int b, int n) {
        if(n < 2){
            return 0;
        }
        int answer = 0;
        while(n >= a){
            answer += n/a*b;
            n = n/a*b + n%a;
        }
        return answer;
    }
}

// a = 2 b=1 n =20  -> 10+5+2+1+1
// a= 3 b=1 n =20 -> 6 + 2 + 1
// a = 4 b =1 n=20 -> 5+1
