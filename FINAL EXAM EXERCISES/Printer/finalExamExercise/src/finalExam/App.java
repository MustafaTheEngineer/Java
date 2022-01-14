package finalExam;

public class App {
    public static void main(String args[]){
        Printer p = new CanonOffice();

        ((Fax) p).fax();
    }
}
