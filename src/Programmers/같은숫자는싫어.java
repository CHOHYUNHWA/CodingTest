package Programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 0, 0, 4, 4, 5, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }


    public static int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int[] answer = {};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                answerList.add(arr[i]);
                if (i == arr.length - 2) {
                    answerList.add(arr[arr.length - 1]);
                }
        }
            answer = answerList.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();


        return answer;
    }
}

