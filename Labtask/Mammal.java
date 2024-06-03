package Labtask;

public class Mammal extends AbstractAnimal1{
    public Mammal( String name){
    super(name);
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    public void makeSound(){
        System.out.println(name + " making sound");
    }
    public void move(){
        System.out.println(name +" is Moving");
    }
}
