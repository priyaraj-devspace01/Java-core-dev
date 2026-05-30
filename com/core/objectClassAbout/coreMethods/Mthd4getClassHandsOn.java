package com.core.objectClassAbout.coreMethods;

public class Mthd4getClassHandsOn {
    public static void main(String[] args) {

        // Always returns runtime  class of an object
          // signature -  public final native Class<?> getClass();

        /// It can't be overridden - as it returning the class name
        Student s1  = new Student(101, "ram");
        System.out.println( s1.getClass().getName());
    }
}
