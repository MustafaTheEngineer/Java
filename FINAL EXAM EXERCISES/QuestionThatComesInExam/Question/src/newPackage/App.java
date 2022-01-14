package newPackage;

interface Swimmable{
    void swim();
}

interface Flyable{
    void fly();
}

class Animal{
    void move(){
        System.out.println("Animal moving...");
    }
}

class Fish extends Animal implements Swimmable{
    @Override
    public void move(){
        System.out.println("Fish moves");
    }

    @Override
    public void swim(){
        System.out.println("Fish flies");
    }
}

class Duck extends Animal implements Swimmable,Flyable{
    @Override
    public void move(){
        System.out.println("Duck moves");
    }
    @Override
    public void fly(){
        System.out.println("Duck flies");
    }
    @Override
    public void swim(){
        System.out.println("Duck swims");
    }
}

public class App {
    public static void main(String args[]){
        Animal a = new Duck();
        a.move();
    }
}
