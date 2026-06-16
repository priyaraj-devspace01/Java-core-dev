package com.colllectionsWithBetter.coreCollectionFrameWork.Day02SetMap01;

/*
==========================================================
HASHSET INTERNAL IMPLEMENTATION - COMPLETE REVISION NOTES
==========================================================

Question:
---------
HashSet stores only values.

Then how does Java internally store data?

Answer:
-------
HashSet internally uses HashMap.

HashMap needs:
    Key   -> Object
    Value -> Object

Since HashSet only stores values,
Java stores the Set element as the KEY
and uses a dummy object called PRESENT as VALUE.

Example:

HashSet<String> set = new HashSet<>();

set.add("Java");

Internally:

HashMap<String, Object> map = new HashMap<>();

map.put("Java", PRESENT);

where

private static final Object PRESENT = new Object();

Every element uses the SAME PRESENT object.

==========================================================
HASHSET INTERNAL CODE (SIMPLIFIED)
==========================================================

public class HashSet<E> {

    private HashMap<E, Object> map;

    private static final Object PRESENT = new Object();

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
}

==========================================================
HASHMAP INTERNAL STRUCTURE
==========================================================

HashMap stores data in an array.

Example:

Node[] table

Initially:

table
|
+----+----+----+----+----+----+
|    |    |    |    |    |    |
+----+----+----+----+----+----+

Each index is called a BUCKET.

==========================================================
NODE STRUCTURE
==========================================================

Each bucket stores Node objects.

class Node<K,V> {

    int hash;
    K key;
    V value;
    Node<K,V> next;
}

Example:

Node
{
    hash = 23015,
    key = "Java",
    value = PRESENT,
    next = null
}

==========================================================
ADDING AN ELEMENT
==========================================================

set.add("Java");

Step 1:
-------
Calculate hashCode()

"Java".hashCode()

Suppose:

23015

Step 2:
-------
Find bucket index

index = hash % arrayLength

23015 % 16

= 7

Step 3:
-------
Go to bucket 7

table[7]

Step 4:
-------
Bucket empty?

YES

Create node

Node
{
    hash = 23015,
    key = "Java",
    value = PRESENT,
    next = null
}

Store node in bucket 7.

==========================================================
WHAT IF COLLISION OCCURS?
==========================================================

Collision means:

Two keys produce same bucket index.

Example:

"Java" -> bucket 7

"Spring" -> bucket 7

Now bucket already occupied.

Before Java 8:

Bucket becomes LinkedList

table[7]

|
v

[Java]
   |
   v

[Spring]
   |
   v

 null

==========================================================
LINKED LIST NODE STORAGE
==========================================================

Node
{
    hash = 23015,
    key = "Java",
    value = PRESENT,
    next -> SpringNode
}

Node
{
    hash = 98123,
    key = "Spring",
    value = PRESENT,
    next = null
}

==========================================================
HOW DUPLICATE CHECK WORKS
==========================================================

set.add("Java")

again

Step 1:
-------
Calculate hash

Step 2:
-------
Find bucket

Step 3:
-------
Traverse linked list

Compare:

existing.hash == new.hash

If true

Compare:

existing.key.equals(newKey)

If true

Duplicate found

DO NOT INSERT

Return false

==========================================================
WHY BOTH hashCode() AND equals() ?
==========================================================

hashCode()
---------
Finds bucket quickly.

equals()
---------
Confirms object is actually same.

Example:

hashCode may collide.

Object A -> hash 100

Object B -> hash 100

Same hash.

Need equals() to verify.

==========================================================
SEARCHING AN ELEMENT
==========================================================

set.contains("Java")

1. Calculate hash
2. Find bucket index
3. Go to bucket
4. Traverse nodes
5. Compare hash
6. Compare equals()

If match found

return true

Else false

==========================================================
REMOVING ELEMENT
==========================================================

set.remove("Java")

1. Calculate hash
2. Find bucket
3. Traverse linked list
4. Find matching node
5. Adjust next pointer
6. Remove node

==========================================================
JAVA 8 OPTIMIZATION
==========================================================

If collisions become too many:

LinkedList

becomes

Red Black Tree

Before:

Java
 |
Spring
 |
Hibernate
 |
SQL
 |
null

O(n)

After:

          Spring
         /      \
      Java     SQL
               /
         Hibernate

O(log n)

This conversion is called TREEIFICATION.

Default threshold:

8 nodes

If bucket contains more than 8 nodes,
LinkedList -> Red Black Tree

==========================================================
ACTUAL STORAGE OF HASHSET
==========================================================

HashSet<String> set = new HashSet<>();

set.add("Java");
set.add("Spring");
set.add("Hibernate");

Internally:

HashMap

------------------------------------------------
| Key        | Value                           |
------------------------------------------------
| Java       | PRESENT                         |
| Spring     | PRESENT                         |
| Hibernate  | PRESENT                         |
------------------------------------------------

All values point to SAME object.

private static final Object PRESENT = new Object();

==========================================================
INTERVIEW SUMMARY
==========================================================

HashSet internally uses HashMap.

HashSet element
    -> stored as HashMap key

HashMap value
    -> dummy PRESENT object

HashMap stores Nodes inside buckets.

Node contains:
    hash
    key
    value
    next

Bucket collisions are handled using:
    LinkedList (before Java 8)
    LinkedList + Red Black Tree (Java 8+)

Search:
    hashCode() -> bucket
    equals()   -> exact match

Average Complexity:
    add()      O(1)
    remove()   O(1)
    contains() O(1)

Worst Case:
    O(n)
    (or O(log n) after treeification)

==========================================================
END OF REVISION NOTES
==========================================================
}

One small correction to your understanding: the bucket index is not simply hash % length in modern HashMap. Internally Java first spreads the hash:
hash = key.hashCode() ^ (key.hashCode() >>> 16);
index = (length - 1) & hash;



/*
=========================================
OPEN ADDRESSING & LINEAR PROBING
=========================================

Interview Insight:

Java HashMap does NOT use Open Addressing
or Linear Probing.

Java HashMap uses:
    Separate Chaining

Collision Handling:
    Bucket -> LinkedList (Java 7)
    Bucket -> LinkedList + Red Black Tree (Java 8+)

Open Addressing:
    Collision resolved by finding another
    empty slot in the same array.

Linear Probing:
    Check next available bucket
    sequentially (i+1, i+2, i+3...)

Major Drawback:
    Primary Clustering
    (many elements grouped together)

Why Java HashMap doesn't use it:
    - Deletion is complex
    - Clustering degrades performance
    - Separate Chaining is easier to manage
      and scales better

Interview Answer:
    "Java HashMap uses Separate Chaining,
    not Open Addressing or Linear Probing
    for collision resolution."
=========================================
Load Factor:
/*
Load Factor:
------------
Load Factor = Number of Elements / Capacity

Default Load Factor = 0.75

Example:

Elements = 13
Capacity = 16

13 / 16 = 0.81

0.81 > 0.75

=> HashMap performs Rehashing/Resizing
=> Capacity increases from 16 to 32

Interview Point:
If (No. of Elements / Capacity) > Load Factor,
HashMap resizes (rehashes).
REMEMBER - DEFAULT SIZE OF THE BUCKET IS - 16 (CAPACITY)
 */

/*
/*
Java 8 Treeification:
---------------------

Suppose all keys collide into Bucket[5]

Before:

table

[0]
[1]
[2]
[3]
[4]
[5] -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90
[6]
[7]

Bucket Size = 9 (> 8)

LinkedList Search Time:
O(n)

---------------------------------

After Treeification:

table

[0]
[1]
[2]
[3]
[4]
[5] -> Red-Black Tree

             40
           /    \
         20      60
        /  \    /  \
      10   30 50   80
                   / \
                  70 90

[6]
[7]

Search Time:
O(log n)

---------------------------------

Interview Insight:

Bucket Size > 8
=> LinkedList converts to Red-Black Tree
=> O(n) becomes O(log n)
=> Feature introduced in Java 8.
*/











