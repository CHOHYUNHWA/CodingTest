package Programmers.level0;

import org.w3c.dom.ls.LSOutput;

public class 유한소수판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(1,16));
    }
    public static int solution(int a, int b) {
        int answer = 2;
        int gcd = gcd(a, b);
        int temp = b/gcd;
        for(int i = 0; i < 1000; i++) {
            if(temp % 2 == 0){
                temp /= 2;
            }
            if(temp % 5 ==0){
                temp /= 5;
            }
            if(temp == 1){
                return 1;
            }
        }
        return answer;
    }
    public static int gcd(int a, int b){
        if(a%b ==0){
            return b;
        }
        return gcd(b,a%b);
    }
}