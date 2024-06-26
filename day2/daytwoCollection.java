package day2;

import java.util.*;

/**
 * daytwoCollection
 */
public class daytwoCollection {

    public static void main(String[] args) {
        System.out.println(" -- Day 2 Collection Framework -- ");
        LearnarrayList();
        LearnStack();
        LearnQueue();
        LearnPriorityQueue();
        LearnHashSet();
        LearnHashMap();
    }

    //ArrayList
    public static void LearnarrayList(){
        System.out.println("----- Learning ArrayList -----");
        ArrayList<String> studentName = new ArrayList<String>();
        studentName.add("Dinesh");
        studentName.add("Suthar");
        studentName.add("Mumbai");
        System.out.println(studentName);
        studentName.add(1, "suthar");
        System.out.println(studentName + studentName.get(1));
        studentName.remove(1);
        System.out.println(studentName + studentName.get(1));
        studentName.remove(String.valueOf("Suthar"));
        System.out.println(studentName);

        //studentName.clear(); //clear all elements
        //System.out.println(studentName);

        //list travesing
        for(int i = 0; i< studentName.size(); i++){
            System.out.println("the element is : " + studentName.get(i));
        }
        for (String string : studentName) {
            System.out.println("Foreach the element is : " + string);
        }
        Iterator<String> it = studentName.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator the element is : " + it.next());
        }
    }
    //Stack
    public static void LearnStack() {
        System.out.println("----- Learning Stack -----");
        Stack<Integer> nums = new Stack<Integer>();
        nums.push(6);
        nums.push(78);
        nums.push(23);
        System.out.println(nums);
        nums.pop();
        System.out.println(nums);
        System.out.println(nums.peek());
    }
    //Queue
    public static void LearnQueue() {
        System.out.println("----- Learning Queue -----");
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(5); // if not added then throws exception
        queue.offer(10); // it return true false for adding element
        queue.add(89); 
        System.out.println(queue);
        queue.poll(); // it returns true/false for removing element
        queue.remove(); // remove element if not element then throws exception
        queue.peek(); //head of queue
        System.out.println(queue);
    } 
    //Priority Queue
    public static void LearnPriorityQueue() {
        System.out.println("----- Learning Priority Queue -----");
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); //use this when we have to remove minimum
        //PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder()); //use this when we to remove max
        queue.add(5); // if not added then throws exception
        queue.offer(80); // it return true false for adding element
        queue.add(16); 
        System.out.println(queue);
        queue.poll(); // it returns true/false for removing element
        queue.remove(); // remove element if not element then throws exception
        queue.peek(); //head of queue
        System.out.println(queue);
    }
    //HashSet
    public static void LearnHashSet() {
        System.out.println("----- Learning HashSet -----");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(8);
        hashSet.add(5);
        System.out.println(hashSet);
        hashSet.remove(5);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.size());
    }
    //HashMap
    public static void LearnHashMap(){
        System.out.println("----- Learning HashMap -----");
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Three", 3);
        System.out.println(numbers);
        
    }
}