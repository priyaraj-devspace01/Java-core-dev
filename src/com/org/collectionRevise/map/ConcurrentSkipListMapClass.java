package com.org.collectionRevise.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListMapClass {
    public static void main(String[] args) {
        // THREAD SAFE + TREE MAP .+ sorted
        // it uses a probabilistic data structure (skip list) fo efficient search, insertion, and update.
        // layers
        /*
        1) ..... [ 1.......5......9]
        2) .....[1,..3,....,5......7,.....9]
        3) .....[1,2,3,4,5,6,7,8,9]

         */

        ConcurrentSkipListMap<Integer, String > map = new ConcurrentSkipListMap<>(); /// concurrent version of treeMap


    }
}
