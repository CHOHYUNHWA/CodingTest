package Programmers.level0;

public class 가까운수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,12,10,28},20));
    }
    public static int solution(int[] array, int n) {
        int answer = 0;
        int min = 0;
        int[] temp = new int[array.length];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i] - n;
        }
        min = temp[0];
        answer = array[0];
        for(int i = 1; i < temp.length; i++) {
            if(Math.abs(min) > Math.abs(temp[i])){
                min = temp[i];
                answer = array[i];
            }
            if(Math.abs(min) == Math.abs(temp[i]) && min > temp[i]){
                answer = array[i];
            }
        }
        return answer;
    }
}


//큰수를 먼저 식별 후
// 큰수에서 - n 의 절대값을 비교
