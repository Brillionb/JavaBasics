package AnonimousClassesAndInterfaces;

public class Director {
    public void force(Counterable counterable, int month){
        String report = counterable.report(month);
        System.out.println(report);
    }
}
