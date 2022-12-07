package Programmers.level1;

public class P와Y의개수 {
    public static void main(String[] args) {
        String s = "PpooyY";

        System.out.println(solution(s));
    }


    static boolean solution(String s) {
        int pCount = 0 ;
        int yCount = 0 ;
        String result = s.toUpperCase();
        for(int i = 0; i<result.length(); i++) {
            if (result.charAt(i) == 'P') {
                pCount++;
            }
        }
        for(int i = 0; i<result.length(); i++){
            if (result.charAt(i) == 'Y'){
                yCount++;
            }
        }
        if (pCount == yCount){
            return true;
        } else return false;
    }
}
