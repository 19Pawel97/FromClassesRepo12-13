package exercises3sda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kazimierz");
        Cat cat2 = new Cat("Mruczek");
        Cat cat3 = new Cat("Garfield");
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat cat: cats) {
            cat.makeSound();
        }
    }
}
