package exercises21june;

import java.util.*;

public class ArrayList {

    public static void arrayList(){
        List<String> firstNames = new java.util.ArrayList<>();
        firstNames.add("Michał");
        firstNames.add("Basia");
        firstNames.add("Wojtek");
        firstNames.add("Wojtek");
        System.out.println("Ta lista ma " + firstNames.size() + " imiona.");

    }
    public static void hashSet(){
        Set<String> firstNamesSet =new HashSet<>();
        firstNamesSet.add("Witek");
        firstNamesSet.add("Helena");
        firstNamesSet.add("Lucja");
        firstNamesSet.add("Helena");
        System.out.println("Ta lista ma " + firstNamesSet.size() + " imiona.");
    }
    public static void hashMap(){
        Map<Integer,String > namesMap = new HashMap<>();
        namesMap.put(1,"Zuzia");
        namesMap.put(2, "Kazik");
        namesMap.put(3,"Weronika");
        System.out.println("Mapa: " + namesMap.size());
        namesMap.put(1, "Zuzanna");
        System.out.println("Mapa po zmianie jednego obiektu: " + namesMap.size());

    }

    public static void main(String[] args) {
        //arrayList();
        //hashSet();
        hashMap();

    }

}
