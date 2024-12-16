package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
    List<String> customList = new ArrayList<>();
    customList.add("GKFFD");
    customList.add("TNANA");
    customList.add("MPMSL");
    customList.add("PSWME");
    customList.add("LZMLF");
    customList.add("JYEBV");
    customList.add("YELNT");
    customList.add("JSNKR");
    customList.add("JFESF");
    customList.add("TMJLL");
    return customList;
    }

    public static void printElementsAndIndex(List<String> customList) {
    for (String element : customList){
        System.out.println("En el índice "+ customList.indexOf(element) + ":" + element);
    }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> customList = createArrayList();
        addElementToList(customList, "AAAAA");
        printElementsAndIndex(customList);

    }


}
