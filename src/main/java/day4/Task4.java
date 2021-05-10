package day4;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
    int [] arr = new int [100];
    int largerNum = 0;
            for(int i = 0; i<arr.length;i++) {
                arr [i] =(int) (Math.random() * 10000);
                if (largerNum<arr[i]){
                    largerNum=arr[i];//Вывести индекс самого большого числа вывести его (индекс) и число также два чилса следующих за ним
                }
            }
        System.out.print(Arrays.toString(arr)+" ");
        System.out.println();
        System.out.println("Большее число:"+ largerNum);
     }
}
