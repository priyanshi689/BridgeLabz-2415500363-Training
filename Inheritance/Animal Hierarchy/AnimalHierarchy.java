public class AnimalHierarchy{
    public static void main(String[] args) {
        // Polymorphism in action
        Animal Dog = new Dog("Tommy", 3);
        Animal Cat = new Cat("Kitty", 2);
        Animal Bird = new Bird("Tweety", 1);

        Dog.makeSound();
        Cat.makeSound();
        Bird.makeSound();
    }
}
