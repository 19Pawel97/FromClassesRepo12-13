package exercises3sda;

import java.util.ArrayList;
import java.util.LinkedList;
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
        for (Cat cat : cats) {
            cat.makeSound();
            cat.eatMouse();
        }

        Dog dog1 = new Dog("Burek");
        Dog dog2 = new Dog("Wałęsa");
        Dog dog3 = new Dog("Reksio");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        for (Dog dog : dogs) {
            dog.makeSound();
        }

        List<AnimalSound> animalSounds = new ArrayList<>();
        animalSounds.add(cat1);
        animalSounds.add(dog1);
        animalSounds.add(cat2);
        animalSounds.add(dog2);
        animalSounds.add(cat3);
        animalSounds.add(dog3);
        for (AnimalSound animalSound : animalSounds) {
            animalSound.makeSound();
        }

        Car car1 = new Car();
        car1.move();

        cat1.move();

        Vet vet = new Vet();

        vet.sayHello(cat1);
        vet.sayHello(cat2);
        vet.sayHello(cat3);
        vet.sayHello(dog1);
        vet.sayHello(dog2);
        vet.sayHello(dog3);
        System.out.println();
        vet.universalSayHello(dog1);
        vet.universalSayHello(cat1);

        Rectangle rectangle = new Rectangle(25d,20d);
        Triangle triangle = new Triangle(12d,22);
        Circle circle = new Circle(12);

        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(circle.getArea());

        List<GetArea> myFigures = new LinkedList<>();
        myFigures.add(rectangle);
        myFigures.add(triangle);
        myFigures.add(circle);

        double result = AreaCounter.countArea(myFigures);
        System.out.println(result);
    }
}
