package finalExam;

public class CanonOffice extends Printer implements Fax,Scan {
    public void fax(){
        System.out.println("Canon Office faxing...");
    }

    public void scan(){
        System.out.println("Canon Office scanning...");
    }
}
