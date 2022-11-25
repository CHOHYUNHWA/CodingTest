package Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 모스부호 {
    public String solution(String letter) {
        String answer = "";
        HashMap<String,String> hashMap = new HashMap<>(){
            {put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        };
        String[] morse = letter.split(" ");
        String[] answerArray = new String[morse.length];
        for(int i = 0; i< morse.length; i++) {
            answerArray[i] = hashMap.get(morse[i]);
        }
        answer = String.join("",answerArray);
        return answer;
    }
}
