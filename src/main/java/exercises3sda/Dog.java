package exercises3sda;


import lombok.Getter;
import lombok.Setter;

public class Dog extends Animal implements AnimalSound {
    @Getter
    @Setter
    private String name;

    public Dog (String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " goes woof woof!!!");
    }

}
