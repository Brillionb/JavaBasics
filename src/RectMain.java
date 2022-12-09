public class RectMain {
    public static void main(String[] args) {
        Rect myRect = new Rect();
        myRect.setParams(10, 15);
        System.out.println("Периметр прямоугольника равен " + myRect.countPerimeter());
        System.out.println( "Площадь прямоугольника " + myRect.countSquare());

    }
}
