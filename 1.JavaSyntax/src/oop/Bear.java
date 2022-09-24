package oop;

public class Bear extends Animal {
    @Override
    public String sayHello() {
        return "rrrr..." + ", my name is " + getNickname() + ", my weight " + getWeight() + " kg";
    }
}
