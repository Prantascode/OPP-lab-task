package Labtask;

public class Main1 {
    public static void main(String[] args) {
        AbstractAnimal1 mammmal = new Mammal("Lion");
        AbstractAnimal1 bird = new Bird("Eagle");
        AbstractAnimal1 reptile = new Reptile("Cobra");

        AbstractAnimal1[] animals = {mammmal,bird,reptile};

        for(AbstractAnimal1 animal : animals){
            animal.eat();
            animal.makeSound();
            animal.move();
        }
    }
    
}
