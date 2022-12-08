package Programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class 다항식더하기 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x + 8"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("x"));
    }
    public static String solution(String polynomial) {
        String answer = "";
        String[] tmp = polynomial.split(" ");
        int tmpI = 0;
        int tmpX = 0;
        List<String> xList = new ArrayList<>();
        List<String> iList = new ArrayList<>();

        for(int i = 0; i<tmp.length; i++) {
            if(tmp[i].equals("x")){
                xList.add("1x");
            } else if(tmp[i].charAt(tmp[i].length()-1) == 'x'){
                xList.add(tmp[i]);
            }
            if(!tmp[i].equals("+") && tmp[i].charAt(tmp[i].length()-1) != 'x'){
                iList.add(tmp[i]);
            }
        }

        String[] xArr = new String[xList.size()];
        for(int i = 0; i< xList.size(); i++) {
            xArr[i] = xList.get(i);
        }
        for(int i = 0; i< xArr.length; i++) {
            xArr[i] = xArr[i].replaceAll("[x]","");
            tmpX += Integer.valueOf(xArr[i]);
        }
        for(int i = 0; i <iList.size(); i++) {
            tmpI += Integer.valueOf(iList.get(i));
        }
        if(tmpX == 1 && tmpI != 0){
            answer = "x" + " "+"+"+" "+String.valueOf(tmpI);
        } else if( tmpX == 1 && tmpI == 0){
            answer = "x";
        }
        else if(tmpX !=0 && tmpI == 0){
            answer = String.valueOf(tmpX)+"x";
        } else if(tmpX == 0 && tmpI != 0){
            answer = String.valueOf(tmpI);
        } else {
            answer = String.valueOf(tmpX) + "x" + " " + "+" + " " + String.valueOf(tmpI);
        }
        return answer;
    }
}

/*
1. polynomial 을 스트링 배열로 변환
2. 각각의 요소에 x가 있는지 검증
3. x요소는 요소끼리 더하고 숫자는 숫자끼리 더하고 리턴
 */
