package exercises3sda;

import lombok.Getter;
import lombok.Setter;

public class Cat implements AnimalSound{
    @Setter
    @Getter
    private String name;
    private Integer miceCounter;

    public Cat (String name) {
        this.name = name;
        this.miceCounter = 0;
    }

    public Cat (String name, Integer miceCounter) {
        this.name = name;
        this.miceCounter = miceCounter;
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " goes meow!!!!");
    }

    public void eatMouse() {
        this.miceCounter ++;
        System.out.println("I ate " + this.miceCounter + " mice!");
    }
}
