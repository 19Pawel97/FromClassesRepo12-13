package exercises3sda;


import lombok.Getter;
import lombok.Setter;

public class Dog {
    @Getter
    @Setter
    private String name;

    public Dog (String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + " goes woof woof!!!");
    }

}
