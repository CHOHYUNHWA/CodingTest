package Programmers;

public class 컨트롤제트_미해결 {
    public static void main(String[] args) {
        System.out.println(solution("10 Z Z 20 30 40"));
    }
    public static int solution(String s) {
        int answer = 0;
        String[] tmp = s.split(" ");
        for(int i=0; i<tmp.length-1; i++) {
            if(tmp[i].equals("Z") && tmp[i+1].equals("Z")){
                tmp[i+1] = "0";
            }
        }
        for(int i = 0; i < tmp.length; i++) {
            if(tmp[i].equals("Z")){
                answer -= Integer.parseInt(tmp[i-1]);
            } else {answer += Integer.parseInt(tmp[i]);}
        }
        return answer;
    }
}
