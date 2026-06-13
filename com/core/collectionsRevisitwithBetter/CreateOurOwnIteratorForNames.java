package com.core.collectionsRevisitwithBetter;


import java.util.Iterator;

 class NameContainer implements Iterable<String>
{
    String[] names;
    int size;

    NameContainer(String[] names)
    {
        this.names = names;
        this.size = names.length;
    }

    // now let's implement the iterable interface
    @Override
    public Iterator<String> iterator() {
//       return new NameContainIterator();

        return new  Iterator<String>() {
            int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public String next() {
                return names[pos++];
            }
        };
    }


    /// here instead of creating a separate class to implement the iterator method we can give the implementation as above using anonymous inner class
//    private class NameContainIterator implements Iterator<String>{
//        int pos = 0;
//
//        @Override
//        public boolean hasNext()
//        {
//            return pos < size;
//        }
//        @Override
//        public String next()
//        {
//            return names[pos++];
//        }
//    }
}

//    public abstract boolean hasNext();


    public class CreateOurOwnIteratorForNames {
    public static void main(String[] args) {

        String[] names = new String[]{"radhika", "biswajit", "chaturrr"};
        NameContainer namesContainer = new NameContainer(names);
        Iterator<String> iterator = namesContainer.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // we can use instead of writing these much of verbose code for using hasNext and next
        // but it should be array or collection implementing the iterable


         for(String n : namesContainer)
         {
             System.out.println(n + " ");
         }
         
         // the moment we make those directly call with the class not implementing the iterable or not an array, it will throw an compile time error



/// note: 
//        there is three methods inside the iterable 
//                1) iterator
//                2) forEach()
//                3) splititerator()
        
        
        //// Iterator method : 
//        hasNext ,  next ,remove, forEachRemaining
        
    }
}
