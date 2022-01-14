package finalExam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileManager {
    private static ArrayList<Worker> list = new ArrayList<>();
    //save
    public static void saveToFile(Worker w,String fileName) throws Exception
    {
        list.add(w);
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(list);
        objectOut.close();
    }
    //load
    public static ArrayList<Worker> loadFromFile(String fileName) throws Exception
    {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        ArrayList<Worker> workers = (ArrayList<Worker>) objectIn.readObject();
        objectIn.close();

        return workers;
    }
}
