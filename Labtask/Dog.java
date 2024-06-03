package Labtask;

public class Dog extends Animal {
    String breed;

    public Dog(String Name, int Age, String Breed) {
        super(Name, Age);
        breed = Breed;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed = " + breed);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

