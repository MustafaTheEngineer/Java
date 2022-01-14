package finalExam;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]){
        List<Worker> li = new ArrayList<>();

        Worker w1 = new Worker(1,"Mustafa",75);
        Worker w2 = new Worker(2,"Esat",60);
        Worker w3 = new Worker(3,"Caldır",100);

        li.add(w1);
        li.add(w2);
        li.add(w3);

        try{
            FileManager.saveToFile(w1, "exam.kbu");
            FileManager.saveToFile(w2, "exam.kbu");
            FileManager.saveToFile(w3, "exam.kbu");
            li = FileManager.loadFromFile("exam.kbu");
            System.out.println(li.get(2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
