package day2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

/**
 * daytwo
 */
public class daytwo {

    public static void print(){
        System.out.println("Printing from functions");
    }

    public static void print(String name){
        System.out.println("Name is :" + name);
    }

    public static void GuessTheNumber(){
        int random_number = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number To guess or Enter -1 to stop : ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            else if (number > random_number) {
                System.out.println("You guessed wrong number. your Number is greater than Random number");
            }
            else if (number < random_number) {
                System.out.println("You guessed wrong number. your Number is less than Random number");
            }
            else{
                System.out.println("CONGRATULATIONS!!!! YOUR GUESS IS CORRECT");
                random_number = (int)(Math.random()*100);
            }
        }
    }

    public static void main(String[] args) {

        //Functions - we use for repatative work
        System.out.println("Day 2 Started");
        GuessTheNumber();
        print();
        print("Dinesh");
        print();

    }
    
}