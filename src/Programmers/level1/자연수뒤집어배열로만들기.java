package Programmers.level1;

public class 자연수뒤집어배열로만들기 {

    public static int[] solution(long n) {
        String answerString = Long.toString(n);
        char[] answerCharArr = answerString.toCharArray();
        int[] answer = new int[answerCharArr.length];
        for(int i =0; i<answer.length; i++){
            answer[i] = Character.getNumericValue(answerCharArr[i]);
        }
        int[] answerArr = new int[answer.length];
        int count = answer.length;
        for(int i=0; i<answer.length; i++){
            answerArr[i] = answer[count-1];
            count--;
        }

        return answerArr;
    }
}
