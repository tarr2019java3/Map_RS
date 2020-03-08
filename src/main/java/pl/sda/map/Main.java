package pl.sda.map;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code


        Generyka<String> generyka = new Generyka<String>("test");
        System.out.println(generyka.getField());

        Generyka<Integer> generyka1 = new Generyka<Integer>(666);
        System.out.println(generyka1.getField());

        // zasada działania  map

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Jan");
        map.put(2, "Andrzej");
        map.put(3, "Sebastian");
        map.put(4, "Karyna");

        //Pętla for po mapie, sout na Klucz: klucz, Wartość: wartosc

        System.out.println(map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + "  ,Wartość: " + entry.getValue());
        }
        /*
           Stworz klasę School:
                           - String name
                           - String city
            Stworz klase Student:
                           - String name
                           - String lastname

            Stworz klika szkół i kilkanaście studentów
            Stwórz mapę w której kluczem będzie obiekt szkoly, a wartością lista studentów

            Map<School, List<Student>>

            Iteracja po mapie:
                - Szkoła1:
                        - Student1
                        - Student2
                - Szkoła2:
                        -Student1
                        -Student2

         */
    }
}
