package day2;

import java.util.Collection;

//Collection - it is group of classes and interfaces by which we can represent a group of objects into single entity 
//Advantages over array - Size is not fixed. - Homogeneous + Heterogeneous element. - Readymade methods are there
//Collection is interface and Collections is predefined class in java.util package
class day3Collection{
    public static void main(String[] args) {
        System.out.println("-------Day 3 Collections ------");

    }
    //Methods in collection interface:
    public static void methodsInCollections(String[] args) {
        System.out.println("-------Collections methodsInCollections ------");
        // add(Object o);
        // addAll(Collection c);
        // remove(Object 0);
        // removeAll(Collection c);
        // retainAll(Collection c)/
        // Clear();
        // isEmpty();
        // size();
        // Contains(Object o);
        // ContainsAll(collection c);
        // toArray(Collection c)
    }

    //List Interfaces- ArrayList, LinkedList and Vector
        //- List is child of collection interface. - Insertion order is preserved. - Duplicatee allowed
        public static void methodsInList(String[] args) {
            System.out.println("-------Collections methodsInList ------");
            //add(index, Object o);
            //addAll(index, Collection c);
            //remove(index);
            //get(index);
            //Set(index, object o);
            
        }

    //Set Interfaces - HashSet and LinkedHashSet
        //- is child of collection interface. - Insertion oder not preserved. -duplicates Not allowed
    //Queue Interfaces - PriorityQueue
        //- FIFO. -

    //Map interface - HashMap, LinkedHashMap and HashTable
        // - It is not derived from Collection interface.
        // - Key value pair
        // - keys are unique. - values are not unique
}