interface Animal {
    // Metoda, którą każda klasa musi zaimplementować
    void sound();

    // Metoda domyślna, która ma już swoje ciało
    default void sleep() {
        System.out.println("This animal is going to sleep.");
    }

    default void eat() {
        System.out.println("This animal is eating.");
    }

    static void endOfDay() {
        System.out.println("The day has ended. All animals are going to sleep.");
    }
}

class Dog implements Animal {
    // Klasa Dog musi zaimplementować metodę sound()
    public void sound() {
        System.out.println("The dog barks: Woof Woof!");
    }
}

class Cat implements Animal {
    // Klasa Cat musi zaimplementować metodę sound()
    public void sound() {
        System.out.println("The cat meows: Meow Meow!");
    }

    // Klasa Cat nadpisuje domyślną metodę sleep() z interfejsu Animal
    @Override
    public void sleep() {
        System.out.println("The cat is purring and going to sleep.");
    }
}
class Bird implements Animal {
    public void sound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }
}

class Cow implements Animal {
    public void sound() {
        System.out.println("The cow moos: Moo Moo!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekty klasy Dog i Cat
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal cow = new Cow();

        // Wywołujemy metodę sound() dla psa i kota
        dog.sound();  // Wywoła metodę sound() z klasy Dog
        cat.sound();  // Wywoła metodę sound() z klasy Cat
        bird.sound();
        cow.sound();

        // Wywołujemy metodę sleep() dla psa i kota
        dog.sleep();  // Wywoła domyślną metodę sleep() z interfejsu Animal
        cat.sleep();  // Wywoła nadpisaną metodę sleep() z klasy Cat
        bird.sleep();
        cow.sleep();

        Animal.endOfDay();
    }
}