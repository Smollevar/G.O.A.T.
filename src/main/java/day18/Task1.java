package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int cell = 0;
        System.out.println(recursionSum(numbers, cell));
    }

    public static int recursionSum(int[] num, int cell) {
        if (cell == num.length)
            return 0;
        return recursionSum(num, cell + 1) + num[cell];
    }
}
/* This was my first solution, that the test didn't accept
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        int n = numbers.length;
        System.out.println(recursionSum(numbers, n));
    }
    public static int recursionSum(int[] num, int n) {
        if (n <= 0)
            return 0;
        return recursionSum(num, n - 1) + num[n - 1];
    }
 */