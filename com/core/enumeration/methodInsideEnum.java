package com.core.enumeration;


import org.w3c.dom.ls.LSOutput;

enum Direction                /// WE CAN ALSO DECLARE METHOD INSIDE ENUM AS NORMAL CLASS - LET'S SUPPOSE FOR EACH TYPE OF DIRECTION WE WANT TO DEFINE THE NAVIGATION, WHERE TO MOVE

{
     // as internally
//     public static final Direction NORTH = new Direction();
    // we can use the anonymous inner class here

    NORTH {
        @Override
        public void moveTo()
        {
            System.out.println("MOVE TO UP (Y+1) ");
        }
    },
    SOUTH {
        @Override
        public void moveTo()
        {
            System.out.println("MOVE TO DOWN (Y-1) ");
        }
    },
    EAST {
        @Override
        public void moveTo()
        {
            System.out.println("MOVE TO LEFT (X-1) ");
        }
    },
    WEST {
        @Override
        public void moveTo()
        {
            System.out.println("MOVE TO RIGHT (X+1) ");
        }
    },;

    abstract void moveTo();
    // we are making it abstract so that each object of direction need to give their own implementation, also mandating this to be
}
public class methodInsideEnum {
    public static void main(String[] args) {

        Direction eastDir = Direction.EAST;
        eastDir.moveTo();
    }
}
