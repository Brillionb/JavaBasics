package AnonimousClassesAndInterfaces;

public class Counter implements Counterable{
    @Override
    public String report(int month) {
        return ("отчет за " + month + " месяцев");
    }
}
