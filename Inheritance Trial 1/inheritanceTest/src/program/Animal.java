package program;

public class Animal {
    private String name;
    protected int age;

    Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public String getName(){
        return name;
    }

}
