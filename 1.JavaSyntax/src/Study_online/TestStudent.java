package Study_online;

public class Student {
    String name;
    int age;
    boolean isMinor;
    char gender;


    public class TestStudent {
        public static void main(String[] args) {
            Student student = new Student();
            System.out.println("имя? " + student.name);
            System.out.println("возраст? " + student.age);
            System.out.println("несовершеннолетний? " + student.isMinor);
            System.out.println("пол? " + student.gender);
        }
    }
}