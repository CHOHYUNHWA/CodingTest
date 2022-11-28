package Programmers;

import java.math.BigInteger;

public class 구슬을나누는경우의수 {
    public static void main(String[] args) {
        System.out.println(solution(30,15));
    }
    public static BigInteger solution(int balls, int share) {
        BigInteger answer = BigInteger.valueOf(0);
        BigInteger n = BigInteger.valueOf(1);
        BigInteger m = BigInteger.valueOf(1);
        BigInteger tmp = BigInteger.valueOf(1);
        for(int i = 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }
        for(int i = 1; i<= share; i++){
            m = m.multiply(BigInteger.valueOf(i));
        }
        for(int i=1; i<= balls-share; i++){
            tmp = tmp.multiply(BigInteger.valueOf(i));
        }
        answer = n.divide(m.multiply(tmp));
        return answer;
    }
}



//n = 5
//m = 3


//분자 5 4 3 2 1  = 120
//분모 2 * 6 = 12