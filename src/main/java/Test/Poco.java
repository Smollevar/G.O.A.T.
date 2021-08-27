package Test;

public class Poco extends Phone implements TurnOnScreen {
    private double first;
    private double second;

    public Poco(double first, double second, String mod) {
        super(mod);
        this.first = first;
        this.second = second;
    }

    public Poco(String mod) {
        super(mod);
    }

    @Override
    public void ring() {
        System.out.println("Phone ringing with sound: CHINA NAMBA OOOONE");
    }

    @Override
    public void turnScreen() {
        System.out.println("");
    }

    @Override
    public double calculated() {
        double game = first - second;
        return game;
    }
}
