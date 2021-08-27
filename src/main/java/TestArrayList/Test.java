package TestArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Doll> dollList = new ArrayList<>();
        List <Doll> newdolllist = new ArrayList<>(dollList);
        dollList.add(new Doll("Sabrina","Hasbro"));
        dollList.add(new Doll("Zelda","Fugifilm"));

        Girl girl = new Girl("Masha",12,dollList);

        for(Doll doll:girl.getDolls())
            System.out.println(doll.getName());
    }
}


