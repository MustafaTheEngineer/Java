package Week4;

public class App {
    public static void main(String[] args){
        Worker worker1 = new Worker("Mustafa",1000);
        Worker worker2 = new Worker("Kaan",100);
        Worker worker3 = new Worker("Berk",100);
        worker1.showInfo();
        worker2.showInfo();
        System.out.println(worker3.getCounter());
    }
    
}
