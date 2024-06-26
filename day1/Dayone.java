package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Dayone {

    public static void main(String[] args) {
        //Printing Statement
        System.out.println("Hello Day 1 - With Println");
        System.out.print("With Print \n");

        //Variables types
            //Primitive - where we store simple value
                //bytes - 1 [-128 to 127]
                //short - 2
                //int - 4
                //long - 8
                //float - 4
                //double - 8
                //char - 2
                //boolean - 1
            //Example of Primitive
                byte age = 127;
                int phone = 1234567892;
                long landline = 123456789336L;
                float pi = 3.14f;
                char letter = 'h';
                boolean isAdult = false;            

            //Non Primitive/ Reference - where we store complex values.
                                // - we have some inbuilt functions here which we can use with these
                                // examples are Strings, Arrays, Classes, Interface, etc.
            //Example of Non Primitive
                String FirstName = new String();
                String LastName = "Suthar";
                FirstName = "Dinesh";
                System.out.println(FirstName +" " + FirstName);

                //Operations on String
                    // - Strings are immutable in Java
                    //concat 
                    String name = FirstName + LastName;
                    System.err.println(name);

                    //charAt
                    System.out.println(name.charAt(0));

                    //length
                    System.out.println(name.length());

                    //replace
                    System.out.println(name.replace("s", "p"));

                    //substring
                    System.out.println(name.substring(6,12));

                //Array
                    //1D array
                    int[] intarray = new int[2];
                    String[] chararray = new String[2];
                    intarray[0] = 5;
                    intarray[1] = 3;
                    chararray[0] = "80";
                    chararray[1] = "40";
                    int[] int_array = {5, 6, 2};
                    System.out.println(intarray[1]);
                    //Operations on String
                        //length
                        System.out.println(intarray.length);
                        //sort
                        Arrays.sort(intarray);
                        System.out.println(intarray[0]);
                    
                    //2D array
                    int[][] marks = new int[2][2];
                    int[][] grade = {{1, 2, 3}, {2, 3, 4}, {6, 3, 1}};
                    System.out.println(grade[1][2]);

            //Casting
              //implicit casting
                // - converting one type of data to other type (int->long),()
                // - always type cast lower size type into higher size data type
                // Example - 
                    double price = 200.00;
                    int gst = 18;
                    price = price + gst; // here gst(int) is casted into double
                    System.out.println(price);
              //Explicite casting
                // - we can cast from higher size into lower size
                // Example - 
                    int p = 100;
                    int fp = p + (int)18.00;
                    System.out.println(fp);
            
            // Constant
                //use final keyword for constant
            final float CONSTANT = 18.00F;

            //Operators
                //1. Arithmetic, 2. assignment, 3. Logical, 4. comparison
                //  +,-,/,%,*       =,++,--          &&,||       ==,<,>,!=

            //Maths Class
                //max, min, random
                    System.out.println(Math.max(age, fp));
                    System.out.println(Math.min(age, fp));
                    System.out.println(Math.random());

            //Taking Input in Java
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your age: ");
            int input_age = sc.nextInt();
            System.out.println("Your age is : " + input_age);
                // taking input of strings
                    System.out.println("Enter Your First Name: ");
                    String firstname = sc.next(); //only take one word from string
                    System.out.println("Your First Name is : " + firstname);
                    System.out.println("Enter Your Name: ");
                    String newname = sc.nextLine(); //It will take full sentance
                    System.out.println("Your Name is : " + newname);

    }

    public static void main1(String[] args) {
        int input_age;
        //lloops
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i<2) {
            System.out.println("Enter the Cash you have : ");
            int Cash = sc.nextInt();
            if (Cash <= 10 && Cash > 0) {
                System.out.println("You only get Toffee");
            }
            else if (Cash > 10 && Cash < 50) {
                System.out.println("You will get toffee and Ice Creame ");
            }
            else{
                System.out.println("You will get everthing ");
            }
            i++;
        }
        int[] arr_int = {1, 2, 3};
        for(int j = 0; j <= 2; j++){
            System.out.println(arr_int[j]);
        }
        for (int item : arr_int) {
            System.err.println(item);
        }

        //Switch Case;
        input_age = 5;
        switch (input_age) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a Day of week");
                break;
        }

        //Break and Continue
        i = 0;
        while(true){
            if (i == 3) {
                i++;
                continue; //control will go to loop and skip steps after this stmt
            }
            System.out.println(i);
            i += 1;
            if (i > 5){
                break; // it will break the loop and exit
            }
        }

        //Exception handling
        int[] marks = {5, 7, 10};
        try {
            System.out.println(marks[4]);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        finally{

        }
        
    }
    
}