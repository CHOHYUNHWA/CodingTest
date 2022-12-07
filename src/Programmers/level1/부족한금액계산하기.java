package Programmers.level1;

public class 부족한금액계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
    }

    public static long solution(int price, int money, int count) {
        long tmp = 0;
        for(int i = 1; i<=count; i++){
            tmp = tmp + price*i;
        }
        long result = tmp-money;
        if(money-tmp >= 0)return 0;

        return result;
    }
}