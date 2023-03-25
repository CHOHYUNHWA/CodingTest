package Programmers.level1;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
    static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] sChar = s.toCharArray();
        int countA=0;
        int countB=0;
        for(int i =0; i< sChar.length; i++){
            if(sChar[i]=='p'){
                countA++;
            } else if (sChar[i]=='y') {
                countB++;
            }
        }
        if(countA != countB){
            answer = false;
        }
        return answer;
    }
}

