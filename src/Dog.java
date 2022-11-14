public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("vuf");
    }

    public void showMood(boolean happy) {
        if (happy) {
            System.out.println("logrer");
        } else {
            System.out.println("knurrer");
        }
    }

    public boolean eat(String foodType) {
        return true;
    }

}
