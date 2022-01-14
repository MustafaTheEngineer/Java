package finalExam;

public class App {
    public static void main(String args[]){
        Dog dog = new Dog();
        Animal dog2;
        
        dog.eat();
        dog.walk();
        

        dog2 = (Animal) dog;

        dog2.eat();
    }
    
}
