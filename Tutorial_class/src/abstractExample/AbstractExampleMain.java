package abstractExample;
class Pig extends Animal{
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Cat extends Animal{
    public void animalSound() {
        System.out.println("The pig says: meow meow");
    }
}
public class AbstractExampleMain {
    public static void main(String[] args) {
        //    Animal myObj = new Animal(); / will generate an error
        Pig piggy = new Pig();
        piggy.animalSound();
        piggy.sleep();
        Cat kitty = new Cat();
        kitty.animalSound();
        kitty.sleep();
    }
}
