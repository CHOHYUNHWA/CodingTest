package Etc;

public class 최대공약수 {
    public static void main(String[] args) {
        System.out.println(gcd(60,19));
    }
    public static int gcd(int a, int b){
        if(a%b ==0){
            return b;
        }
        return gcd(b,a%b);
    }
}

