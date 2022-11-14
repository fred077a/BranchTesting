public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("miaw");
    }

    public boolean eat(String foodType) {
        return true;
    }

    public void showMood(boolean happy) {
        if (happy) {
            System.out.println("Logrer");
        } else {
            System.out.println("Knurrer");
        }
    }

}
