package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "0 ";
        for (int i = 1; i < 20001; i++) {
            str = str + i + " ";
        }
        System.out.print(str);
        long stopTime = System.currentTimeMillis();
        System.out.println();
        System.out.println(stopTime - startTime);
        System.out.println();

        long startTime2 = System.currentTimeMillis();
        StringBuilder stb = new StringBuilder("0 ");
        for (int i = 1; i < 20001; i++) {
            stb.append(i + " ");
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.print(stb);
        System.out.println();
        System.out.println(stopTime2 - startTime2);
    }
}
