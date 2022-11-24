package Programmers;

public class 피자나눠먹기_투 {
    public int solution(int n) {
        int answer = 0;
        int gcd = 0;
        int totalSlice = 0;
        gcd = GCD.getGCD(6, n);
        totalSlice = n*6/gcd;
        answer = totalSlice/6;
        return answer;
    }
}
class GCD{
    public static int getGCD(int a, int b){
        if(a%b ==0){
            return b;
        }
        return getGCD(b,a%b);
    }
}

/*
1 -> 1 1명이 6조각 6 공약수 1    1*1*6 / 6 = 1
2 -> 1 2명이 3조각씩 6조각 공약수 3 2*3*6 / 6 =
3 -> 1 3명이 2조각씩 6조각 1판 공약수 3
4 -> 2 4명이 3조각씩 12조각 2판 공약수 2
5 -> 5 5명이 6조각씩 30조각 5판 공약수 1
6 -> 1 6명이 1조각씩 6조각 공약수 6
7 -> 7 7명이 6조각씩 42조각 공약수 1
8 -> 4 8명이 3조각씩 24조각 공약수 2
9 -> 9 9명이 6조각씩 54조각 공약수 3
10 -> 5 10명이 3조각씩 60조  공약수 2
 */





