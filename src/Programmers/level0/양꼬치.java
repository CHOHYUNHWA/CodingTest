package Programmers.level0;

public class 양꼬치 {
    public static void main(String[] args) {

    }

    public static int solution(int n, int k) {
        int answer = 0;
        int beverage = k - n/10;
        answer = n*12000 + 2000*beverage;
        return answer;
    }
}
