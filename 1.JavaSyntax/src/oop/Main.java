package oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bear bear = new Bear();

        dog.setNickname("Muhtar");
        dog.setWeight(30);
        dog.sayHello();
        cat.setNickname("Barsik");
        cat.setWeight(4);
        cat.sayHello();
        bear.setNickname("Mihail");
        bear.setWeight(250);
        bear.sayHello();
    }
}
