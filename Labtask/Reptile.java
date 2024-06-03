package Labtask;

public class Reptile extends AbstractAnimal1 {
    public Reptile(String name){
        super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is moving");
    }
    
}
