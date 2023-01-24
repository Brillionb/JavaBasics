package interfaces;

public interface Cookable {
    public void cook();


    default public void addSpices(){
        System.out.println("Adding spices"); // 
    }
}
