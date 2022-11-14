public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("miaw");
    }

    public void showMood(boolean happy) {
        if (happy) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }

    public boolean eat(String foodType) {
        return true;
    }

}
