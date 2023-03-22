package Programmers.level1;

public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(987));
    }

        public static int solution(int n) {
            int answer = 0;
            String answerString;
            answerString=Integer.toString(n);
            char[] answerCharArr = answerString.toCharArray();
            int[] answerIntArr = new int[answerCharArr.length];
            for(int i =0; i< answerCharArr.length; i++){
                answerIntArr[i] = Character.getNumericValue(answerCharArr[i]);
                answer += answerIntArr[i];
            }
        return answer;
    }
}

//Character 배열로 변환
//int 배열로 변환
//배열을 순회하며 모두더하기
