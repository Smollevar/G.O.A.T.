package day4;
public class Task3 {
    public static void main(String[] args) {
        int sumArr = 0;
        int maxNum = 0;
        int[][] twoArray = new int[12][8];
        for (int i = 0; i < twoArray.length; i++)
            for (int n = 0; n < twoArray[i].length; n++)
                twoArray[i][n] = (int) (Math.random() * 50);
        for (int i = 0; i < twoArray.length; i++) {
            for (int n = 0; n < twoArray[i].length; n++)
                sumArr += twoArray[i][n];
        } if (maxNum<sumArr){
            maxNum=sumArr;//Разобраться с выводом суммы строк, и индекса самой большой строки
        }
            for (int i = 0; i < twoArray.length; i++) {
                for (int n = 0; n < twoArray[i].length; n++)
                    System.out.print(twoArray[i][n] + " ");
                System.out.print("  //  Сумма элементов массива - " + sumArr);
                System.out.println();
            }
        }
    }

