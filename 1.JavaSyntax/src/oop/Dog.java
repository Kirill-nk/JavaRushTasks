package oop;

public class Dog extends Animal {

    @Override
    public String sayHello() {
        return "gav-gav.." + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg";
    }
}
