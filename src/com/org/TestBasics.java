package com.org;

public class TestBasics {
    public static void main(String[] args) {


        // let's basics for unary operator

        // prblm - 1
        int a  = 3;
        int b = a++ + ++a - a;
        System.out.println(b);


        // prblm - 2
        int i = 0;
        while(i++ < 3)
        {
            System.out.print(i + " , ");
        }

        // prblm - 3
         /// ternary operator
//        find max

        int x = 33;
        int y = 55;
        int max = (x>y)? x: y;
        System.out.println(max);



        // similarly for the case
        int xx = 11;
        int yy = 22;
        int zz = 33;
     int maxOfThree = (xx > yy)?
             ( xx > zz ? xx : zz) :
             (yy > zz ?yy : zz);
        System.out.println(maxOfThree);

    }

}
