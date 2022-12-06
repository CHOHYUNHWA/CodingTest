package Programmers;

import java.util.Arrays;

public class 외계어사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"z","d","x"},new String[]{"def", "dww", "dzx"}));
        }
    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        String s = "";
        Arrays.sort(spell);
        for(int i = 0; i < spell.length; i++) {
            s += spell[i];
        }
        for(int i = 0; i < dic.length; i++) {
            char[] chars = dic[i].toCharArray();
            Arrays.sort(chars);
            dic[i] = new String(chars);
        }
        for(int i = 0; i < dic.length; i++) {
            if(dic[i].equals(s)){
                return 1;
            }
        }
        return answer;
    }
}
