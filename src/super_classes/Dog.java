package super_classes;

public class Dog extends Animal {
    String breed; // порода

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Гав!");
    }
}
