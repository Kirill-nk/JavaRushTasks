package oop;

public class Dog extends Animal {

    @Override
    public void sayHello() {
        System.out.println("gav-gav.." + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg");
    }
}
