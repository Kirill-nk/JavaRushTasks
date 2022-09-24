package oop;

public class Cat extends Animal{
    @Override
    public String sayHello() {
        return "Myau-myau" + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg";
    }
}
