package Labtask;

public class Animal {
    String name;
    int age;

    public Animal(String Name, int Age) {
        name = Name;
        age = Age;
    }

    public void displayInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
