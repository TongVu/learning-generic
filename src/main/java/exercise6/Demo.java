package exercise6;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Nhut", 17.0);
        Student student2 = new Student("Dinh", 17.8);
        Student student3 = new Student("Vu", 15.0);
        Student student4 = new Student("Truc Anh", 19.6);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        GenericComparable genericComparableObj =
                new GenericComparable<>(studentList);

        System.out.println("HIGHEST ==============================");
        System.out.println(genericComparableObj.highest());

        System.out.println("\nLOWEST ==============================");
        System.out.println(genericComparableObj.lowest());

        List<String> stringList = new ArrayList<>();
        String name1 = "Vu" ;
        String name2 = "Dinh" ;
        String name3 = "Nhut" ;
        String name4 = "Anh Nguyen" ;
        stringList.add(name1);
        stringList.add(name2);
        stringList.add(name3);
        stringList.add(name4);
        GenericComparable genericComparableObj2 =
                new GenericComparable<>(stringList);

        System.out.println("\n\nHIGHEST NAME ==============================");
        System.out.println(genericComparableObj2.highest());

        System.out.println("\nLOWEST NAME ==============================");
        System.out.println(genericComparableObj2.lowest());
    }
}
