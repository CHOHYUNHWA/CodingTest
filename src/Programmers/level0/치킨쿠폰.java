package Programmers.level0;

public class 치킨쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(1081));
    }
    public static int solution(int chicken) {
        int answer = 0;
        int b = 0;
        int c = 0;
        while(chicken>=10) {
            answer += chicken/10;
            c = chicken/10;
            b = chicken%10 ;
            chicken = c+b;
        }
        return answer;
    }
}

/*
a쿠폰수 b남은쿠폰수 c추가쿠폰 d시켜먹은 닭
1081    1        108    108
109     9        10     118
19      9        1      119
10      0        1      120
b = a%10
c = a%10
a = b+c
 */
