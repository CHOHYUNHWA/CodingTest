package Programmers.level0;

public class 짝수홀수개수 {
    public static void main(String[] args) {
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++){
            if(num_list[i]%2 ==0){
                answer[0]++;
            }else answer[1]++;
        }
        return answer;
    }
}
