package Programmers;

import java.util.Arrays;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3},{1,5,3}};
        System.out.println(Arrays.toString(solution(array,commands)));
    }//테스트 케이스 코드
    public static int[] solution(int[] array, int[][] commands) {
//        int[] nArray = new int[array.length+1];
//        for(int i =0; i<array.length; i++){
//            nArray[i] = array[i];
//        }
        int[] answer = new int[commands.length]; //정답을 닮을 배열 작성
        int[] dummy = {}; //copyOfRange 하여 나온 결과값을 닮을 배열을 작성
        for(int i = 0; i<commands.length; i++){
            dummy = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            //commands에 따른 array의 0번째 요소부터 1번째 요소깨지 불러와 dummy에 담음
            Arrays.sort(dummy); //더미를 sorting 해줌
            answer[i] = dummy[commands[i][2]-1]; //answer 배열에 값을 담아줌
        }
        return answer;
    }
}