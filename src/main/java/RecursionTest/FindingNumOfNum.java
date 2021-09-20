package RecursionTest;

public class FindingNumOfNum {
    public static void main(String[] args) {
        System.out.println(seven(7217));

    }
/*
7217 % 10 = 7 == 7? yes sum 0 + 1 7217/10  ->;
721 % 10 = 1 == 7? nope sum = 1 721 / 10    ->;
72 % 10 = 2 == 7? nope sum =1 72 / 10    ->;
7 % 10 = 7 == 7? yes sum 1 + 1 = 2;
 */

    public static int seven(int i) {
        if (i <= 1) {
            return 0;
        }
        System.out.println(i);
        if (i % 10 == 7) {
            return seven(i / 10) + 1;
        } else return seven(i / 10);
    }
}


