package GeoStromPosslible;

import java.awt.image.PixelGrabber;
import java.util.*;

public class Start {
    public static void main(String[] args) {

        System.out.println("Input year until random Geomagnit storm");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Map<Integer, String> mapOfDeath = new HashMap();

        System.out.println("Введите вашу год");
        int currentYear = scanner.nextInt();
        // через рандом где рандомятся числа от 1 до 100 и если выпадает меньше 5 то пиздец апокалипсис якобы и ленивые пидорасы поднимут бунннд вместо того чтобы все строить и чинить и будет мэд макс а перед ним ядерный пиздец
        System.out.println("Введите диапазон лет получения в ближайшем будующем появление геомагнитного шторма");
        int endOfLife = scanner.nextInt();
//        for (int q = currentYear; currentYear < endOfLife; currentYear++) {
//            Random.
//            //Тут добавить рандом где выводятся тру или фалз если тру пизда мирку
//            if (q > 0) {
//               mapOfDeath.put()
//
//            }
//        }
        // Создать рандмоайзер который при вводе информации вычисляется возможность варианта геомагнитного шторма, который настигает раз в много лет.
        // Будет выводиться количество выпавших да их года

    }

}
