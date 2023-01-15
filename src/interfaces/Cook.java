package interfaces;

public class Cook extends Employee implements Cookable{
    public Cook(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println(super.getName() + " is cooking");
    }
}
