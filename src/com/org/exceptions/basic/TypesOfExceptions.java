package com.org.exceptions.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TypesOfExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        // Till now we covered about run time exceptions


        // Checked Exception - checked during compile time if not handled,
        // we can also add to the method signature as well for checked exception

        try {
            FileReader fr = new FileReader("a.txt");

        }//  catch (ArrayIndexOutOfBoundsException e) {   // not by this
        // e.printStackTrace();
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new FileNotFoundException();
        }
        finally {
            // generally used for resource close and management
            System.out.println("hello world");
        }


        }
    }

