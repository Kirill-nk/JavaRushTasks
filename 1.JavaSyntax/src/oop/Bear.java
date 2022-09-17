package oop;

public class Bear extends Animal {
    @Override
    public void sayHello() {
        System.out.println("rrrr..." + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg");
    }
}
