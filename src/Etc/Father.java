package Etc;

public class Father{
    int money = 1_000_000;

    public void buyGold(){
        money -= 200_000;
        System.out.printf("금을 삽니다. 잔액은" + money + "입니다.");
    }
    public void buyIPAD(){
        money -= 500_000;
        System.out.printf("국밥을 삽니다. 잔액은" + money + "입니다.");
    }
}
