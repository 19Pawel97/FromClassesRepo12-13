package exercises3sda;

public class Vet {

    public void sayHello(Cat cat) {
        System.out.println("Hello " + cat.getName() + "!");
    }

    public void sayHello(Dog dog) {
        System.out.println("Hello " +  dog.getName() + "!");
    }

    public void universalSayHello (Animal animal) {
        System.out.println("Hello " + animal.getName());
    }
}
