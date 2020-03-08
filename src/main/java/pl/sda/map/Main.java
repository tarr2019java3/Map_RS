package pl.sda.map;

import pl.sda.map.school.School;
import pl.sda.map.school.Student;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        School school = new School("I LO","Toruń");
        School school1 = new School("II LO", "Bydgoszcz");
        School school2 = new School("III LO", "Włocławek");
        School school3 = new School("Szkoła Magi i Czarostwa", "Hogwart");
        School school4 = new School("Szkoła Wilka", "Kaer Morhen");

        Student student = new Student("Baltazar", "Pietruszka");
        Student student1 = new Student("Antoni", "Json");
        Student student2 = new Student("Anatol", "Starybrat");

        Student student3 = new Student("Geralt", "z Rivi");
        Student student4 = new Student("Eskel", "Kozioł");
        Student student5 = new Student("Lambert", "Fraszka");

        Student student6 = new Student("Ania", "Mała");
        Student student7 = new Student("Justyna", "Walczewska");
        Student student8 = new Student("Adam", "Dobry");
        Student student9 = new Student("Adam", "Niedobry");
        Student student10 = new Student("Adam", "Zły");

        Student student11 = new Student("Heniek", "Protier");
        Student student12 = new Student("Harry", "Potter");
        Student student13 = new Student("Hermiona", "Gringer");
        Student student14 = new Student("Ron", "Wesley");
        Student student15 = new Student("Nevil", "Longbotton");
        Student student16 = new Student("Gerwazy", "Wazy");
        Student student17 = new Student("Tom", "Paluch");
        Student student18 = new  Student("John", "Doe");
        Student student19 = new Student("Jane", "Doe");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        List<Student> studentList4 = new ArrayList<>();
        studentList4.add(student3);
        studentList4.add(student4);
        studentList4.add(student5);
        studentList4.add(student6);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);
        studentList2.add(student10);

        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(student11);
        studentList3.add(student12);
        studentList3.add(student13);
        studentList3.add(student14);
        studentList3.add(student15);
        studentList3.add(student16);
        studentList3.add(student17);

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student18);
        studentList1.add(student19);
        studentList1.add(student19);

        Map<School, List<Student>> map1 =new HashMap<School, List<Student>>();

        map1.put(school, studentList);
        map1.put(school1, studentList1);
        map1.put(school2, studentList2);
        map1.put(school3, studentList3);
        map1.put(school4, studentList4);

        System.out.println(map);
        System.out.println("");

        for (Map.Entry<School, List<Student>> entry : map1.entrySet()) {
            System.out.println("Klucz: " + entry.getKey().getCity() + "  " + entry.getKey().getName());
            for (int i=0; i < entry.getValue().size();  i++ ){
                System.out.println(entry.getValue().get(i).toString());
            }

        }

    }
}
