package com.org.collectionFramework.map.HashTable;

import java.util.Hashtable;

public class HashTableClass {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashTable = new Hashtable<>();


        /*
            HashMap vs HashTable
              i ) Hashtable is synchronized.
              ii) No null key or value
              iii) Legacy class, concurrentHashMap
              iv) slower than HashMap,
              v) null can't be used for neither for key nor value.
              vi) only uses linked list in case of linked list (not balanced bst like hashMap)
              vii) all methods are synchronized.
              viii) that's why we need the synchronized HashMap.




         */
        hashTable.put(1,"one");
        hashTable.put(2,"two");
        hashTable.put(3,"three");
        hashTable.put(4,"four");
        hashTable.put(5,"five");
//        hashTable.put(null,"hello");
//        hashTable.put(33, null);
        // and other than that all are same as HashMap
        System.out.println(hashTable);
    }
}
