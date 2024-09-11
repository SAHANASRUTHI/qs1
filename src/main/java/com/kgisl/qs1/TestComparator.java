package com.kgisl.qs1;

import java.util.*;
import java.io.*;

class TestComparator {
    public static void main(String args[]) {
        // Creating a list of Stus
        ArrayList<Stu> al = new ArrayList<Stu>();
        al.add(new Stu(101, "Vijay", 23));
        al.add(new Stu(106, "Ajay", 27));
        al.add(new Stu(105, "Jai", 21));

        Stu[] students = new Stu[3];

        // Initialize the array elements
        // students[0] = new Stu(101, "Vijay", 23);
        // students[1] = new Stu(106, "Ajay", 27);
        // students[2] = new Stu(105, "Jai", 21);

        // Arrays.sort(students);
        // System.out.println("Sorting by arrays");
        // for (Stu st : al) {
        // System.out.println(st.rollno + " " + st.name + " " + st.age);
        // }

        System.out.println("Sorting by Name");
        // Using NameComparator to sort the elements
        Collections.sort(al, new NameComparator());
        // Traversing the elements of list
        for (Stu st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by Age");
        // Using AgeComparator to sort the elements
        // Collections.sort(al, new Comparator<Student>(){
        // public int compare(Stu age1,Stu age2){
        // return age1.age
        // }
        // });
        // Travering the list again
        for (Stu st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        // Strams
        al.stream().forEach(System.out::print);

    }
}