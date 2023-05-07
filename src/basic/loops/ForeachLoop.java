package basic.loops;

public class ForeachLoop {
    public static void main(String[] args) {
        int [][] array = {{1,4,6,8}, {7, 3, 8, 45}, {5, 4}};

        for (int [] array2 : array){
            for (int i:array2){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
