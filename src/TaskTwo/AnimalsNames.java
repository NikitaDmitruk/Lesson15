package TaskTwo;

import java.util.LinkedList;

public class AnimalsNames {
    private LinkedList<String> names;

    public LinkedList<String> getNames() {
        return names;
    }

    public void setNames(LinkedList<String> names) {
        this.names = names;
    }

    public void addName (String name) {
        names.addFirst(name);
    }

    public void deleteName () {
        names.removeLast();
    }
}

