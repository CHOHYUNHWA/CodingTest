package Programmers.level1;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }


    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int leftPos = 10;
        int rightPos = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 11;
            }
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftPos = numbers[i];
            }
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightPos = numbers[i];
            } else {
                int leftDistance = Math.abs(numbers[i] - leftPos) / 3 + Math.abs(numbers[i] - leftPos) % 3;
                int rightDistance = Math.abs(numbers[i] - rightPos) / 3 + Math.abs(numbers[i] - rightPos) % 3;

                if (leftDistance < rightDistance) {
                    answer += "L";
                    leftPos = numbers[i];
                } else if (leftDistance > rightDistance) {
                    answer += "R";
                    rightPos = numbers[i];
                } else {
                    if(hand.equals("left")){
                        answer += "L";
                        leftPos = numbers[i];
                    } else{
                        answer += "R";
                        rightPos = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
}