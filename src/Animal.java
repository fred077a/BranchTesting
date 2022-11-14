public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean eat(String foodType);

    public abstract void makeSound();

    public abstract void showMood(boolean showMood);


}
