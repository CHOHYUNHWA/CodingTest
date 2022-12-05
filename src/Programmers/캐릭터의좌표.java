package Programmers;

import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "left", "left", "right"},new int[]{3,3})));
    }
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int horizontal = board[0]/2;
        int vertical = board[1]/2;
        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("up") && answer[1] < vertical){
                answer[1] = answer[1]+1;
            }
            else if(keyinput[i].equals("down") && answer[1] > -vertical){
                answer[1] = answer[1]-1;
            }
            else if(keyinput[i].equals("left") && answer[0] > -horizontal){
                answer[0] = answer[0]-1;
            }
            else if(keyinput[i].equals("right") && answer[0] < horizontal){
                answer[0] = answer[0]+1;
            }
        }
        return answer;
    }
}
