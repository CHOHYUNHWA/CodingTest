package Programmers.level1;

public class 내적 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2}));
    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        int answerList[] = new int[a.length];
        for(int i =0; i<answerList.length; i++){
            answerList[i] = a[i]*b[i];
            answer += answerList[i];
        }
        return answer;
    }
}