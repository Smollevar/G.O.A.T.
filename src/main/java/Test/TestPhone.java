package Test;

public class TestPhone {
    public static void main(String[] args) {

        Motorola moto = new Motorola("Moto E7 Plus");
        Poco poco = new Poco(234.234,200.111,"Poco M3");

        moto.ring();
        poco.ring();
        System.out.println();

        System.out.println(moto.toString());
        System.out.println(poco.toString());

        System.out.println();
        moto.charging();
        poco.charging();
        float f = (float)poco.calculated();
        System.out.println(f);
        System.out.printf("The game is: %.1f\n",f);
        System.out.println(f);
    }

    public static void test(Phone phone) {
        phone.ring();
    }
}
