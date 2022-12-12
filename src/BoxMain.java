public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(25, 25, 25);

        Box box3 = box1.addSizes(box2);
        System.out.println(box3.volume());

        Box box4 = new Box(box1, box2);
        System.out.println(box4.volume());


    }
}
