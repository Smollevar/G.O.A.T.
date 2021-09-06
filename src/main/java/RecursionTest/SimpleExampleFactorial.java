package RecursionTest;

public class SimpleExampleFactorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    public static int fac(int i) {
        if (i == 1)
            return 1;
        else {
            return i * fac(i - 1);
        }
    }
}
