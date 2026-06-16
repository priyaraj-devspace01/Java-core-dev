package com.colllectionsWithBetter.coreCollectionFrameWork.listInterface;

public class LinkedListClass02 {
    public static void main(String[] args) {
        // even if it don't use the shifting while adding and removing element, but reaching to that place still takes time
        // Internals
         /*
         it internally uses a doubly linked list where it makes the last as pointer last and first element as first
         with small optimization, in case of getting, adding and removing, it checks from which end it faster to reach to the desired element,
         but still not used in production in general, only used for implementation for queue and stack
          */

        // same methods as arrayList
    }
}
