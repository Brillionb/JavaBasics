public class DogMain {
    public static void main(String[] args) {
        //
        Dog myDog = new Dog();
        myDog.dogBreed = "Золотистый ретривер";
        myDog.name = "Супчик";
        myDog.speed = 5;

        System.out.println(myDog.info());
        myDog.run();


    }
}
