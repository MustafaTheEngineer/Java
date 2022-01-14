package program;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Boncuk");
        Dog dog = new Dog("Karabaş");

        Animal[] list = {cat,dog};

        System.out.println(list);
    }
}
