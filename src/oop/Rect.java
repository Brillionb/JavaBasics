package oop;

class RectMain {
    public static void main(String[] args) {
        Rect myRect = new Rect();
        myRect.setParams(10, 15);
        System.out.println("Периметр прямоугольника равен " + myRect.countPerimeter());
        System.out.println( "Площадь прямоугольника " + myRect.countSquare());
    }
}


public class Rect {
    private double length;
    private double width;

    //устанавливает параметры прямоугольника
    public void setParams(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // вычисляет периметр
    public double countPerimeter() {
        return (length + width) * 2;
    }

    // вычисляет площадь
    public double countSquare() {
        return length * width;
    }
}
