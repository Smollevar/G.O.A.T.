package day8;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder();
        long m = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            strb.append(i).append(" ");
        }
        System.out.println(strb.toString());
        System.out.println();
        System.out.println((double) (System.currentTimeMillis() - m));
        System.out.println();

        String conc = " ";
        long s = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            String o = i + conc;
            System.out.print(o);
        }
        System.out.println();
        System.out.println((double) (System.currentTimeMillis() - s));
    }
}