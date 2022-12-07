package Programmers.level1;

class 문자열다루기기본 {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "12345";
        System.out.println(solution(s1));
    }


    public static boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() ==6) {
            if (s.chars()
                    .allMatch(ch -> Character.isDigit(ch))) {
                return answer;
            }
        }
        return false;
    }
}