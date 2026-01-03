package com.org.learnOOPS.VeryBasics.filestructure;
// import java.*; (X)
//import java.util.*;(X)
// it needs to be
//either
//or
import java.util.regex.Pattern;
public class ImportStatementNeedToKnow {
    public static void main(String[] args) {
        // Always remember if there is a class we want to use which is inside a subpackage, then in that
        // case we need to import the class to from the preceding class
        /*
            java
             - -- util
              ---------regex
               -----------------Pattern

               i) we have to import from java.util.regex.*;
         */

        Pattern  p = Pattern.compile("Hello, world");

    }
}
