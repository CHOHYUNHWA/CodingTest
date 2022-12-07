package Programmers.level0;

import java.util.Arrays;

public class 배열회전시키기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3},"right")));
    }
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] head = new int[1];
        int[] tail = new int[numbers.length-1];

        if(direction.equals("left")){
            answer = Arrays.copyOfRange(numbers,1,numbers.length+1);
            answer[numbers.length-1] = numbers[0];
        }
        if(direction.equals("right")){
            answer = new int[head.length + tail.length];
            head[0] = numbers[numbers.length-1];
            tail = Arrays.copyOfRange(numbers,0,numbers.length-1);
            System.arraycopy(head,0,answer,0,head.length);
            System.arraycopy(tail,0,answer,head.length,tail.length);
            return answer;
        }
        return answer;
    }
}

//right 일때  {1,2,3} -> {3,1,2} 로 리턴.
//
