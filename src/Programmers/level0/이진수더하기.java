package Programmers.level0;

public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int temp1 = Integer.parseInt(bin1,2);
        int temp2 = Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(temp1+temp2);
        return answer;
    }
}
