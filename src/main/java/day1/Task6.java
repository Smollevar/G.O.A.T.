package day1;

public class Task6 {
    public static void main(String[] args) {
        int k = 4;
        int s = 1;
        while (s <= 9) {
            int v = k * s;
            System.out.println(s + "x" + k + "=" + v);
            s++;
        }
    }
}
