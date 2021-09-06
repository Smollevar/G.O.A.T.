package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int i) {
        if (i <= 1) {
            return 0;
        }
        int sum = 0;
        if (i % 10 == 7) {
            sum++;
        }
        return count7(i / 10) + sum;
    }
}