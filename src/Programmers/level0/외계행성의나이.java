package Programmers.level0;

public class 외계행성의나이 {
    public String solution(int age) {
        String answer = "";
        String alphabet = "abcdefghij";
        String zeroToten = "0123456789";
        String stringAge = Integer.toString(age);
        for(int i=0; i<stringAge.length(); i++) {
            for(int j=0; j<alphabet.length(); j++) {
                if(stringAge.charAt(i) == zeroToten.charAt(j)) {
                    answer += alphabet.charAt(j);
                }
            }
        }
        return answer;
    }
}
