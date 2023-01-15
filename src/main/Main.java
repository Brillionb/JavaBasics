package main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<StringBuilder> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            names.add("student" + (i));
            strings.add(new StringBuilder().append(numbers.get(i)).append("-").append(names.get(i)));
        }
        for (StringBuilder string : strings){
            System.out.println(string);
        }

    }
}


