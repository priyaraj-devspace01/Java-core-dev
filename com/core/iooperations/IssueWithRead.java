package com.core.iooperations;

import java.io.IOException;

public class IssueWithRead {
    public static void main(String[] args) throws IOException {
//        int x = System.in.read();
//        System.out.println((char) x);

        // here the main con is read() only take the first byte
        // we can do only repeated call for read()
        //  or

        // as it internally stores the buffer like for string - (apple) - [a],[p],[p],[l],[e],[/n] while we access it converts
        // ASCII - 65, 102, and so on and only returns the first byte


//        so we have to fetch like this


                String out = "";
                char c;

                while(true) {
                    c = (char) System.in.read();
                    if(c == '\n' || c == '\r') {  // Stop at Enter key
                        break;
                    }
                    out += c;  // Only add non-newline characters
                }

                System.out.println("Your name is: " + out);
            }
        }

        // to solve this issue of reading of data from console in this complicated code, then java introduces new class, Reader( )

      /*
      Reader( ) - abstract class - which works based on stream of characters
       1) BufferedReader
       2) InputStreamReader()
       3) FileReader
       */


