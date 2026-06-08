package com.core.collectionsRevisitwithBetter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(11,22,445,566,788));

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();

            if (next == 22) {
                iterator.remove();
            }
        }

        for (Integer num : list) {
            System.out.println(num);
        }
    }
}

/**
 * ConcurrentModificationException (Fail-Fast):
 * Thrown when a collection is structurally modified while it is being
 * traversed by an Iterator, except through the Iterator's own methods.
 *
 * Indicates that the collection and iterator are out of sync.
 * Fail-fast behavior helps detect bugs early instead of allowing
 * unpredictable iteration results.
 */