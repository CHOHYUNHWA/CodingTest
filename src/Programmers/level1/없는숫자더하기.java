package Programmers.level1;

class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {4,5};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] numbers) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        int answer = 45;
        for(int i = 0; i<10; i++){
            for(int j = 0; j< numbers.length; j++)
            if(a[i] == numbers[j]){
                answer = answer - a[i];
            }
        }
        return answer;
    }
}

