package Programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new StringBuilder(new String(arr)).reverse().toString();
        }
    }