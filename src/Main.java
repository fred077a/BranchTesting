public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("hund");
        Cat cat = new Cat("kat");

        dog.makeSound();
        cat.makeSound();

        dog.eat("cat");
        cat.eat("fish");
    }
}
