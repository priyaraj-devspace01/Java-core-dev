package com.core.objectClassAbout.coreMethods;

class Demo implements Cloneable
{

    int demoId;
    String demoName;
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public Demo(int demoId, String demoName) {
        this.demoId = demoId;
        this.demoName = demoName;
    }
}
public class MthdHandsOnClone {
    public static void main(String[] args) throws CloneNotSupportedException {

         // clone () - create copy of an object
        /// Syntax :
//          class Object
//          {
//               protected Object clone() throws CloneNotSupportedException {
//
//               }
//          }



        /// Why we need to make the class to be clonable interface
           // 1) database
           // 2) Thread

        /// we didn't implement the Clonable interface bcz it doesn't have any method - in java such type of interface are called , marked interface.
        Demo demo = new Demo(101, "meeting");
        Demo d1  = (Demo) demo.clone();
        System.out.println(d1.demoId + " : "+ d1.demoName);

    }
}
