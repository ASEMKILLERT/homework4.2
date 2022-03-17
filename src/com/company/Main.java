package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        System.out.println(ListA);
        ListA.add("Aziza");
        ListA.add("Tamerlan");
        ListA.add("Adil");
        ListA.add("Nazima");
        ListA.add("Sezim");
        System.out.println(ListA);
        Collections.sort(ListA,Collections.reverseOrder());
        ArrayList<String> ListB = new ArrayList<>();
        System.out.println(ListB);
        ListB.add("Damir");
        ListB.add("Askat");
        ListB.add("Azamat");
        ListB.add("Fatima");
        ListB.add("Asema");
        System.out.println(ListB);
        Collections.reverse(ListB);
        Collections.sort(ListB,Collections.reverseOrder());

        ArrayList <String> ListC = new ArrayList<>();
        System.out.println(ListC);
        ListC.addAll(ListA);
        ListC.addAll(ListB);
        System.out.println("ListA" + ListA);
        System.out.println("ListB" + ListB);
        System.out.println("ListC" + ListC);
        System.out.println(ListC);
        Collections.sort(ListC,Collections.reverseOrder());



    }
}
