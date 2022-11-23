package Programmers;

import java.util.Arrays;

public class 이차원으로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 2)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int temp = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[temp];
                temp++;
            }
        }
        return answer;
    }
}

// 1,1 1,2 2,1 2,2