package com.colllectionsWithBetter.addsOnToCollections.comparableInterface01;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int mark;
    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student o) {
      if(this.mark != o.mark){
          return this.mark - o.mark;
      }
      return this.name.compareTo(o.name);
    }
}

public class DataLossWhenIdentitcalSorting {
    public static void main(String[] args) {



        // at high level both are not same
        // but when we use them inside treeSet or TreeMap there is a chance of data loss while storing them
        TreeSet<Student> tStds = new TreeSet<>();
        tStds.add(new Student("rajShamani", 78));
        tStds.add(new Student("hitesh", 78));

        System.out.println(tStds.size());   // expected to be 2 ,but it's one because tree set uses internally compareTo actually compare the elements so here as they both are sam marks but if we want to add them both we need provide complete equality condition as well



    }
}
