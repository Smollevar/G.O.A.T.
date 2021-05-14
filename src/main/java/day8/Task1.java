package day8;

import org.w3c.dom.ls.LSOutput;

public class Task1 {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        int g = 0;
        for (int i = 0; i < 20001; i++) {
            StringBuilder strb = new StringBuilder();
            strb.append(g).append(" ");
            g++;
            System.out.print(strb.toString());
        }
        System.out.println();
        System.out.println((double) (System.currentTimeMillis() - m));

        long s = System.currentTimeMillis();
        int k = 0;
        for(int i = 0; i< 20001;i++){
            String conc = " ";
            String o = k + conc;
            k++;
            System.out.print(o);
        }
        System.out.println();
        System.out.println((double)(System.currentTimeMillis()-s));
    }
}