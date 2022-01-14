package finalExam;

import java.util.Comparator;

class NameComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}

class IdComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getId() - o2.getId();
    }
    
}

class WeightComparator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return (int) Math.round(o1.getWeight() - o2.getWeight());
    }
    
}
