package com.company;

import java.io.*;
import java.util.*;

public class Menu {

    public void menu(int[] array) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer;
        do {
            System.out.println("Menu:");
            System.out.println("1. set");
            System.out.println("2. list of %2 values");
            System.out.println("3. map");
            System.out.println("4. quit");
            System.out.print("Choose action:");
            answer = reader.readLine();

            switch (answer){
                case "set":
                    menuSet(array);
                    break;
                case "list":
                    menuList(array);
                    break;
                case "map":
                    menuMap(array);
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Wrong value! Try again");
            }
        }while(true);

    }
    private static void menuSet(int[] array) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i!=array.length;i++) {
            set.add(array[i]);
        }

        for (Integer elem : set) {
            System.out.print(elem+",");
        }
        System.out.println();
    }
    private static void menuList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i!=array.length;i++) {
            if(array[i]%2 == 0)
                list.add(array[i]);
        }

        for (Integer elem : list) {
            System.out.print(elem+",");
        }
        System.out.println();
    }
    private static void menuMap(int[] array) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i!=array.length;i++) {
                map.put("Element("+(i+1)+"", array[i]);
        }

        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.print(elem.getKey()+": "+elem.getValue());
        }
        System.out.println();

    }
}
