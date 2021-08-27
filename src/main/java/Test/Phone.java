package Test;

public abstract class Phone {

    private String mod;


    public Phone(String mod) {
                this.mod = mod;
    }


    public void charging (){
        System.out.println("This phone is charging");
    }

    public abstract void ring();

    @Override
    public String toString() {
        return "This phone is: " + mod;
    }
}
