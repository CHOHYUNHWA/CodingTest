package Etc;

public class Child extends Father {
    int money = 10_000;

    public void buyCookie() {
        money -= 2000;
        System.out.printf("쿠키를 삽니다. 잔액은" + money + "입니다.");
    }

    public void buyGookBap() {
        money -= 8000;
        System.out.printf("국밥을 삽니다. 잔액은" + money + "입니다.");
    }
}
