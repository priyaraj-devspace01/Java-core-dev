package com.org.collectionRevise.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapClass {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        // Java - segment based locking - 16 segments --> smaller hashmaps
        // only the segment is being written to or read from is locked.
        // read : do not require locking unless there is a write operation happening on the same segment
        // write : lock


        // java -8 --> NO Segmentation.
//                 ---- it uses CAS(Compare and swap)
         //                  .. no lock except resizing or collision
        //and all methods are same
    }
}
