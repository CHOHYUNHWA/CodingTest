package Programmers.level1;

public class 시저암호 {
    public static void main(String[] args) {
        String s = "a b ";
        int n = 1;
        System.out.println(solution(s, n));
        System.out.println(s.charAt(2));
    }// 테스트 케이스


    public static String solution(String s, int n) {
        String answer = ""; // 정답을 닮을 변수 선언
        char temp = 0; //변환된 문자를 닮을 변수 선언
        for (int i = 0; i < s.length(); i++) {
            if(n > 25){
                n = n-26;
            } // n이 26이 넘을 경우 알파벳 범위를 벗어남으로 -26(알파벳 개수 처리)
            if ((char) (s.charAt(i)) >= 97 && (char) (s.charAt(i)) <= 122) {
                if ((char) (s.charAt(i) + n) > 122) {
                    temp = (char) (s.charAt(i) + n - 26);
                    answer = answer + temp;
                } else {
                    temp = (char) (s.charAt(i) + n);
                    answer = answer + temp;
                }
            }// 대문자 변환의 경우 반복문으로 표현
            if ((char) (s.charAt(i)) >= 65 && (char) (s.charAt(i)) <= 90) {
                if ((char) (s.charAt(i) + n) > 90) {
                    temp = (char) (s.charAt(i) + n - 26);
                    answer = answer + temp;
                } else {
                    temp = (char) (s.charAt(i) + n);
                    answer = answer + temp;
                }
            } // 소문자 변환의 경우 반복문으로 표현
            if (s.charAt(i) == ' ') {
                answer = answer + " ";
            }// 만약 공백이 있을시 그대로 출력 하기위한 코드
        }
        return answer;
    }
}