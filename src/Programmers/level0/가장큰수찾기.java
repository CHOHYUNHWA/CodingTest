package Programmers.level0;

public class 가장큰수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,8,3}));
    }
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
                count = i;
            }
        }
        answer[0] = max;
        answer[1] = count;
        return answer;
    }
}

