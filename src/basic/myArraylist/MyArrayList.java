package basic.myArraylist;

import java.util.ArrayList;
import java.util.Collections;


public class MyArrayList {
    public static void main(String[] args) {
        abc2("A", "C", "B", "Z", "B", "D");
    }

    public static ArrayList<String> abc(String ... s){
        ArrayList<String> list1= new ArrayList<>();
        for (int i=0; i < s.length; i++){
            list1.add(s[i]);
        }
        Collections.sort(list1);
        for (int i=0; i< list1.size()-1; i++){
            if (list1.get(i) == list1.get(i+1)){
                list1.remove(i);
            }
        }
        System.out.println(list1);
        return list1;
    }

    public static  ArrayList<String> abc2(String ... s){
        ArrayList<String> list1= new ArrayList<>();
        for (String str : s){
            if (!list1.contains(str)){
                list1.add(str);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
        return list1;
    }
}
