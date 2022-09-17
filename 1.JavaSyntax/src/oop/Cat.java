package oop;

public class Cat extends Animal{
    @Override
    public void sayHello() {
        System.out.println("Myau-myau" + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg");
    }
}
