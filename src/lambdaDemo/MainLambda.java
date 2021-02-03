package lambdaDemo;

import java.util.*;
import java.util.Map.Entry;

public class MainLambda {
    public static void main(String[] args) {

       /* Growl growling = (a, str) -> {
            String b = (str.repeat(a));
            System.out.println(b);
        };*/
        Growl grw = (a, str) -> System.out.println((str.repeat(a)));

        grw.growling(3, "br");
        // System.out.println(growling.toString());

        Program prg = new Program();
        prg.doIt(grw, 6, "Grr");

        prg.growling(3, "Wr");

        prg.testDefaultInterfaceMethod();


        loopMapJava8();

        //loopListJava8();
    }

    public static void loopMapJava8() {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
/*
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }*/
        // lambda forEach
        map.forEach(( k,  v) -> System.out.println("Key : " + k + ", Value : " + v));

        // lambda Stream
        //map.entrySet().stream().forEach(System.out::println);
        Set<Entry<String, Integer>> entries =  map.entrySet();
         entries.stream().forEach(System.out::println);

    }
    public static void loopListJava8() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // lambda
        //list.forEach(x -> System.out.println(x));

        // method reference
        list.forEach(System.out::println);
    }


}

