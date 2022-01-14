package finalExam;

public class CanonProfessional extends Printer implements ColoredPrint,Fax,Scan {
    public void coloredPrint(){
        System.out.println("Pro Colored printing...");
    }

    public void fax(){
        System.out.println("Faxing...");
    }

    public void scan(){
        System.out.println("Canon Professional Scanning...");
    }
}
