package exercise;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args){
        List<Person> c = new LinkedList<Person>(); // Type safety

        c.add(new Person("Mustafa"));
        c.add(new Person("Kaan"));
        c.add(new Person("Ömer"));

        ListIterator<Person > iter = c.listIterator();

        while(iter.hasNext()){
            System.out.println(iter.next());  
        }
        System.out.println("--------------------");
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
    }
}
