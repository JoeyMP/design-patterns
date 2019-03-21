package Facade;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        CheckFacade checkFacade = new CheckFacade();
        checkFacade.search("Peru","Argentina","Buenos Aires");
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        ArrayList num = new ArrayList();
        num.add(1);
        num.add("2");
        num.add(2);

    }
}
