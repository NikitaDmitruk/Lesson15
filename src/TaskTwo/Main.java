package TaskTwo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        AnimalsNames animalsNames = new AnimalsNames();
        animalsNames.setNames(new LinkedList<>());
        animalsNames.addName("Panda");
        animalsNames.addName("Tiger");
        animalsNames.addName("Rabbit");
        for (String element : animalsNames.getNames()) {
            System.out.print(element + " ");
        }
        animalsNames.deleteName();
        System.out.println();
        for (String element : animalsNames.getNames()) {
            System.out.print(element + " ");
        }
        System.out.println();
        animalsNames.deleteName();
        for (String element : animalsNames.getNames()) {
            System.out.print(element + " ");
        }
    }
}
