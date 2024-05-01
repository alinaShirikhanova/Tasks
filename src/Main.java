import super_classes.Animal;
import super_classes.Dog;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog("Бобик", 10, "Собака", "Буль терьер");

        Animal[] animals = new Animal[3];
        for (int i = 0; i < animals.length; i++) {
            animals[i].print_info();
        }
    }
}
