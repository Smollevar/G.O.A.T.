package RecursionTest;

public class SumFactorial {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241};
        int n = numbers.length;
        System.out.println(recursionSum(numbers, n));
    }
    /* WHAT HAPPEND HERE:
    1241 + [3-1]  ->1241+11=1252
    10 + [2-1]    ->10+1 =11
    1 + [1-1]     ->1+0=1
    0 RETURN 0    ->
     */
    public static int recursionSum(int[] num, int n) {
        if (n <= 2)
            System.out.println(num[n]);
        if (n <= 0)
            return 0;
        return recursionSum(num, n - 1) + num[n - 1];
    }
}
