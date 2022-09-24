package oop;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bear bear = new Bear();

        dog.setNickname("Muhtar");
        dog.setWeight(30);
//        dog.sayHello();
        cat.setNickname("Barsik");
        cat.setWeight(4);
//        cat.sayHello();
        bear.setNickname("Mihail");
        bear.setWeight(250);
//        bear.sayHello();


//        int[] array = new int[5];

//        int[] arr = {1, 5, 8, 7, 9};

        Animal[] animals = {dog, cat, bear};

        animalSay(animals);
    }

    public static void animalSay(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].sayHello());
        }

    }
}
