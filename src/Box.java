public class Box {
    private int length;
    private int width;
    private int height;

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(int length) {
        this.width = this.height = this.length = length;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // конструктор принимает коробку и устанавливает размеры у вызывающего объекта как у переданного
    public Box(Box box){
        this.length = box.length;
        this.width = box.width;
        this.height = box.height;
    }
// конструктор принимает 2 коробки и устанавливает размеры новой коробки = сумме размеров этих коробок
    public Box (Box box1, Box box2){
        this.length = box1.length + box2.length;
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;

    }

    public void setDimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return length * width * height;
    }

    Box addSizes(Box box) {
        Box newBox = new Box();
        newBox.length = this.length + box.length;
        newBox.width = this.width + box.width;
        newBox.height = this.height + box.height;
        return newBox;
    }

    // метод сравнивает объемы коробок
    int compare(Box box){
        int result;
        if (this.volume() > box.volume()){
            result = 1;
        } else if (this.volume() == box.volume()){
            result = 0;
        } else {
            result = -1;
        }
       return result;
    }


}
