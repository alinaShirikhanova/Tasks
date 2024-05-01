package super_classes;

public class Animal {
    String name;
    int age;
    String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void print_info(){
        System.out.println(name + " " + age + " " + species);
    }
}
