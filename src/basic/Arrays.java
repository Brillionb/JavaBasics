package basic;

public class Arrays {
    public static void main(String[] args) {
        // тип[] имяМассива = new тип[размерность]
    //При иниициализации массива при помощи ключевого слова new элементам сразу присваиваются значения по умолчанию
    //если это массив чисел - значение по умолчанию = 0, если массив типа boolean - false,
    // если массив переменных ссылочного типа - null
    }
}

class ArrayOfNums{
    public static void main(String[] args) {
        //Задача создать массив из 100 элементов, где значение каждого элемента увеличивается от 0 с шагом 10
        int[] arrayOfNums = new int[100];
        for (int i = 0; i < arrayOfNums.length; i++){
            arrayOfNums[i] = i * 10;
            System.out.println(arrayOfNums[i]);
        }
    }
}
class ForeachIntArray{
    public static void main(String[] args) {
        //Цикл For-each используется только в том случае, когда не нужно изменять элементы массива,
        //т.е. нельзя присваивать новые значения его элементам

        int[] arrayOfNums = new int[100];
        for (int i = 0; i < arrayOfNums.length; i++){ // здесь i - порядковый номер элемента массива
            arrayOfNums[i] = i * 10;
        }
        for (int j : arrayOfNums) {
            System.out.println(j);// а здесь j - сам элемент массива
        }

        char[] arrayOfChars = new char[2];
        arrayOfChars[0] = 'a';
        arrayOfChars[1] = 'b';
        for (char ch: arrayOfChars) {
            System.out.println(ch);
        }
    }
}
class ArrayHomework {
    public static void main(String[] args) {
        //Задача создать массив и проинициализировать его значениями от 100 до 1000
        //Создать второй массив по длине равный первому и проинициализировать его теми зе значениями в обратном
        //порядке
        //В цикле for-each вывести все элементы второго массива

        int[] arrayForward = new int[900];
        int[] arrayBackward = new int[arrayForward.length];
        for (int i = 0; i < arrayForward.length; i++) {
            arrayForward[i] = i + 100;
            arrayBackward[arrayForward.length-i-1] = arrayForward[i];
        }
        for (int nums : arrayBackward){
            System.out.println(nums);
        }
     }
}
class ArrayHomeworkSecondEdition{
    public static void main(String[] args) {
        int[] arrayForward = new int[900];
        int[] arrayBackward = new int[arrayForward.length];
        for (int i = 0, j = arrayForward.length-1; i < arrayForward.length; i++, j--){
            arrayForward[i] = i + 100;
            arrayBackward[j] = arrayForward[i];
        }
        for (int nums : arrayBackward){
            System.out.println(nums);
        }
    }
}
