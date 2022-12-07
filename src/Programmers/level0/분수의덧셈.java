package Programmers.level0;

import java.util.Arrays;

public class 분수의덧셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,2,1,3)));
    }

    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int denum3 = denum1*num2 + denum2*num1;
        int num3 = num1*num2;
        int gcd =0;
        for(int i =1; i <= denum3 && i <= num3; i++){
            if(denum3%i ==0 && num3%i ==0){
                gcd = i;
            }
        }
        answer[0] = denum3/gcd;
        answer[1] = num3/gcd;
        return answer;
    }
}

//8/10 경우
//최소공약수를 구해야함.
//유클리드호제법으로 (60,48의 경우)
// 60%48 = 12
// 48%12 =0  a,b 의나머지(c)로 b를 나눴을때 0 이면 최소공약수가됨.
