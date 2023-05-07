package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    static int count = 0;
    public static void main(String[] args)  throws FileNotFoundException {
        File file = new File("C:\\Users\\galin\\IdeaProjects\\Battleship\\Topics\\Files\\Theory\\dataset_91065.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a % 2 == 0 && a !=0){
                count++;
            } else if (a == 0){
                break;
            }

          }
        System.out.println(count);


    }
 }

