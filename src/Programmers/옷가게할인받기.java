package Programmers;

public class 옷가게할인받기 {
    public int solution(int price) {
        int answer = 0;
        answer = price;
        if(price >=100000 && price < 300000){
            answer = (int) (price*0.95);
        }
        if(price >=300000 && price < 500000){
            answer = (int) (price*0.9);
        }
        if(price >=500000){
            answer = (int) (price*0.8);
        }
        return answer;
    }
}
