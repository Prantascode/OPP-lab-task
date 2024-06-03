package Labtask;

public class Bird extends AbstractAnimal1 {
    public Bird(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is flying");
    }
}
