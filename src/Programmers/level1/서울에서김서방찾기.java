package Programmers.level1;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane","Kim"}));
    }
    public static String solution(String[] seoul) {
        String answer = "";
        int count = 0;
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}

