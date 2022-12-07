package Programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class 숨어있는숫자의덧셈_투 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));

    }
    public static int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[a-zA-z]");
        for(int i = 0; i < arr.length; i++){
//            if(arr[i].contains("1") ||
//                    arr[i].contains("2") ||
//                    arr[i].contains("3") ||
//                    arr[i].contains("4") ||
//                    arr[i].contains("5") ||
//                    arr[i].contains("6") ||
//                    arr[i].contains("7") ||
//                    arr[i].contains("8") ||
//                    arr[i].contains("9") ||
//                    arr[i].contains("0")){
            if(!arr[i].equals("")){
                answer += Integer.parseInt(arr[i]);
            }
        }
//        String str = my_string.replaceAll("[a-zA-Z]"," ");
//        System.out.println(str);
//        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));
//        String [] str = my_string.replaceAll("[a-zA-Z]"," ").split("");
        return answer;
    }
}
