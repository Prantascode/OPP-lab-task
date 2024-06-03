package Labtask;

public abstract class AbstractAnimal1 implements Animal1 {
    protected String name;

    public AbstractAnimal1(String name){
        this.name = name;

   }
   public abstract void move();

}
