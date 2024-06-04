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
        queue.add(5);
        queue.offer(10);
        queue.add(89);
        System.out.println(queue);
    } 
}