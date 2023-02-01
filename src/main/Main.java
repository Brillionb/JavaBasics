package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean b1=true, b2 = false;
        int i1 = 1, i2 = 2;

        System.out.println((i1 | i2) == 3);
       // System.out.println(i2 && b1);
        System.out.println(b1 || !b2);
        System.out.println((i1 ^ i2) < 4);


    }
}


