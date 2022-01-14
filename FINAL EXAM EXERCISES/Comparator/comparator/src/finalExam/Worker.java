package finalExam;

import java.io.Serializable;

public class Worker implements Comparable<Worker>,Serializable{
    private int id;
    private String name;
    private double weight;

    public Worker(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return name + ": " + this.id;
    }
    @Override
    public int compareTo(Worker o) {
        return o.id - this.id;
    }
    
}
