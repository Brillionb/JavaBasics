public class Rect {
    double length;
    double width;

    //устанавливает параметры прямоугольника
    void setParams(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // вычисляет периметр
    double countPerimeter() {
        return (length + width) * 2;
    }

    // вычисляет площадь
    double countSquare() {
        return length * width;
    }
}
