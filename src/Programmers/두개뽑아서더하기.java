package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }


       static int[] solution (int[] numbers){
            ArrayList<Integer> answer = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
            for (int i = 0; i < answer.size(); i++) {
                if (!result.contains(answer.get(i))) {
                    result.add(answer.get(i));
                }
            }

            Collections.sort(result);
            int[] result1 = result.stream().mapToInt(i -> i).toArray();

            return result1;
        }

    }

