package day2;

import java.lang.reflect.Constructor;

/**
 * day2oops
 */
//*A. Classes and Objects */
public class day2oops {

    public static void main(String[] args) {
        System.out.println("Day 3 With OOPs in Java");
        
        //for class Pen
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel Pen";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Ballpoint";
        pen2.write();

        //For class Student
        Student student1 = new Student("Dinesh", 25);
        //Student student1 = new Student();
        Student student2 = new Student(student1);  
        student2.PrintInfo();

    }
}

class Pen {
    String color;
    String type;

    public void write(){
        //this - It refers to the current object. In other words, 'this' represents the instance of the class where it's used. 
        System.out.println("Write something With color : " + this.color + " and type : " + this.type);
    }
}

//public class test { String str1 = "Wrong way";} //There cannot be two public classes in a single Java program.

class Student {
    String Name ;
    int Age;
    //Constructor
    Student(){ //non-parametrised constructot
        System.out.println("Inside Student Constructor");
    }
    Student(String name, int age){ //parametrised constructot
        this.Name = name;
        this.Age = age;
    }
    Student(Student student2){ // 
        this.Name = student2.Name;
        this.Age = student2.Age;
    }

    public void PrintInfo(){
        System.out.println("Name : "+ this.Name);
        System.out.println("Age : " + this.Age);
    }

    //Destructor
    //The destructor is the opposite of the constructor. The constructor is used to initialize objects-
    //-while the destructor is used to delete or destroy the object that releases the resource occupied by the object.
    //Remember that there is no concept of destructor in Java. In place of the destructor, Java provides the 
    //garbage collector that works the same as the destructor. The garbage collector is a program (thread) that runs on the JVM. 
    //It automatically deletes the unused objects (objects that are no longer used) and free-up the memory. 
    //The programmer has no need to manage memory, manually. It can be error-prone, vulnerable, and may lead to a memory leak.
}

//2. Polymorphism - more than one form
    //a. - compile time Polymorphism - method over loading
/**
 * day2oops
 */
class day2oops2 {

    public static void main(String[] args) {
        School school = new School();
        school.school_name = "Tip Top";
        school.estd = 1997;
        school.PrintInfo(school.estd);
        school.PrintInfo(school.school_name);
        school.PrintInfo(school.school_name, school.estd);
    }
}
class School{
    String school_name;
    int estd ;

    public void PrintInfo(String school_name){
        System.out.println(school_name);
    }
    void PrintInfo(int estd){
        System.out.println(estd);
    }
    public void PrintInfo(String school_name, int estd){
        System.out.println(school_name + " " + estd);
    }
}

//3.Inheritance - taking properties from one class(Parent) to another class(Child) is known as inheritance

class Inheritance{
    public static void main(String[] arg){
        Parent parent = new Parent();
        parent.Name = "abcd";
        parent.Age = 36;
        parent.Grand_Name = "cd";
        parent.Grand_Age = 68;
    }
}
//Sngle Level
//MultiLevel
//Heirarchy
//Hybrid - combination of single, multilevel and heirarchy
//Multiple - it not possible in Java but solution is there using Interfaces
class Family{
    String Name_of_family;
    int member;
}
class GrandParent extends Family{ // this is Single level (Family->GrandParent)
    String Grand_Name;
    int Grand_Age;
}
class Parent extends GrandParent{ // this is Single level (Family->GrandParent->Parent)
    String Name;
    int Age;
}
class uncles extends GrandParent{ //this is heirarchy. uncles and parent both drived from GrandParent
    String uncle_name;
    int Uncle_age;
}

//Encapsulation - Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class.
    //Access modifier
        //1. Public - can be accessed in all class and packages
        //2. Private -  The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
        //3. Protected - can be access in same package and only sub-classes of other packages
        //4. Default - it we don't write anything then it's default - Can be accessed in same package

//Abstraction - 
//1.Abstract Class
    // An abstract class must be declared with an abstract keyword.
    // It can have abstract and non-abstract methods.
    // It cannot be instantiated.
    // It can have constructors and static methods also.
    // It can have final methods which will force the subclass not to change the body of the method.

//Interfaces -
    // All the fields in interfaces are public, static and final by default.
    // All methods are public & abstract by default.
    // A class that implements an interface must implement all the methods declared in the interface.
    // Interfaces support the functionality of multiple inheritance.
