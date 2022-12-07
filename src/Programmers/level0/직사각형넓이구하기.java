package Programmers.level0;

public class 직사각형넓이구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,1},{2,1},{2,2},{1,2}}));
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int vertical = 0;
        int horizontal = 0;
        for(int i = 0; i < dots.length; i++) {
            if(dots[0][0] != dots[i][0]){
                horizontal = Math.abs(dots[0][0]-dots[i][0]);
                break;
            }
        }
        for(int i = 0; i < dots.length; i++) {
            if(dots[0][1] != dots[i][1]){
                vertical = Math.abs(dots[0][1]-dots[i][1]);
                break;
            }
        }
        answer = vertical*horizontal;

        return answer;
    }
}
