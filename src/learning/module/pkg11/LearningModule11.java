package learning.module.pkg11;

import java.util.*;
import java.util.Scanner;

/* @author Matthew Walichnowsky - 200171919 */

public class LearningModule11 {

    public static void main(String[] args) {
        
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        
        question20(); 
        question22(); 
        question27(); 
        question30();
        question35();
        
    } // End of Main Method}
    public static void sp(){
        // Add line space function to shorten typing time.
        System.out.println("");
    }
        /**
         * Question 1 - Create a for loop that counts from 1 to 10
         */
    public static void question1() {
        
        System.out.println("Question 1");

        for (int i = 1; i <= 10; i++) {
            
            System.out.print(i + "\n");
                                   
        } // End of for Statement.
        
        sp();
        
    } // End of question1.
        
        
        /**
         * Question 2 - Create a for loop that counts from 10 to 1
        */
    public static void question2() {
            
        System.out.println("Question 2");

        for (int i = 10; i >= 1; i--) {
            
            System.out.print(i + "\n");
                        
        } // End of for Statement.
        
        System.out.print("\n");
        
    } // End of question2.
        
        /**
         * Question 3 - Create a for loop that counts from 10 to 50 in steps of 3
         */
    public static void question3() {
            
        System.out.println("Question 3");

        for (int i = 10; i <= 50; i = i + 3) {
            
            System.out.print(i + "\n");
                        
        } // End of for Statement.
        
        System.out.print("\n");
        
    } // End of question3.
        
        /**
         * Question 4 - Create a for loop that counts from 50 to 10 in steps of 7
         */
    public static void question4() {
            
        System.out.println("Question 4");

        for (int i = 50; i >= 10; i = i - 7) {
            
            System.out.print(i + "\n");
                        
        } // End of for Statement.
        
        sp();
        
    } // End of question4.
        
        /**
         * Question 5 - Create a while loop that counts from 1 to 10 
         */
    public static void question5() {
            
        System.out.println("Question 5");

        int i = 1;
                
        while (i <= 10) {
                    
            System.out.print(i + "\n");
            
            i++;
            
        } // End of for Statement.
        
        sp();
        
    } // End of question5.
        
        /**
         * Question 6 - Create a while loop that counts from 40 to 0 in steps of 3
         */
    public static void question6() {
            
        System.out.println("Question 6");

        int i = 40;
                
        while (i >= 0) {
            
            System.out.print(i + "\n");
            
            i = i - 3;
                        
        } // End of for Statement.
        
        sp();
        
    } // End of question6.
        
        /**
         * Question 7 - Create a do...while loop that counts from 1 to 10
         */
    public static void question7() {
            
        System.out.println("Question 7");

        int i = 1;
                
        do {
            
            System.out.print(i + "\n");
            
            i = i + 1;
            
        } // End of do Statment
        
        while (i != 11);
        
        sp();

    } // End of question7.
        
        /**
         * Question 8 - Create a do...while loop that counts from 10 to 1 in steps of 3
         */
    public static void question8() {
            
        System.out.println("Question 8");

        int i = 10;
                
        do {
            
            System.out.print(i + "\n");
            
            i = i - 3;
            
        } // End of do Statment
        
        while (i != -2);
        
        sp();
                        
    } // End of question8.
        
        /**
         * Question 9 - Create a do...while loop that will keep asking a user to enter 
         * data until they type the word exit
         */
    public static void question9() {

        System.out.println("Question 9");

        // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        String user; 
        do {
            
        // Output the prompt.
        System.out.print("Please enter data: ");
        
        // Wait for the user to enter a line of text.
        user = keyboard.nextLine();

        }  while (!user.equals("exit"));
        
        System.out.println("Exit command accepted.\n");
        
    } // End of question9. 
                        
        /**
         * Question 10 - Create a while loop that will keep asking a user to enter data until
         * they type the word exit
         */
    public static void question10() {
            
        System.out.println("Question 10");
        
        // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        // Output the prompt.
        System.out.print("Please enter data: ");
        
        // Wait for the user to enter a line of text.
        String user = keyboard.nextLine();
                
        while (!user.equals("exit")) {
            
        // Output the prompt.
        System.out.print("Please enter data: ");
        
        // Wait for the user to enter a line of text.
        user = keyboard.nextLine();
            
            System.out.println();
                        
        } // End of for Statement.
        
        System.out.println("Exit command accepted.\n");
        
    } // End of question10.
        
        /**
         * Question 11 - Create an array to hold 5 integers (1, 3, 5, 7, 9)
         */
    public static void question11() {
        // Declare an array
        int[] values;
        
        // Declares an Arrays Memory
        values = new int[5];
        
          values[0] = 1;
          values[1] = 3;
          values[2] = 5;
          values[3] = 7;
          values[4] = 9;

        System.out.println("Question 11");      
        System.out.println("Your Array Values are Accepted.");
        
        sp();
        question12(values);
        question13(values);
        question14(values);
        question15(values);
        question16(values);
        question17(values);
        question18(values);
        question19(values); 
        
    } // End of question11.
        
        /**
         * Question 12 - Using a for loop, print the numbers in the array 
         */
    public static void question12(int[] values) {

        System.out.println("Question 12");        
        System.out.println("Your Array Values are: ");
     
        for (int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);            
        } // End of for Statement.
        
        sp();
        
    } // End of question12.
        
        /**
         * Question 13 - Using a for loop, print the numbers in the array in reverse order
         */
    public static void question13(int[] values) {

        System.out.println("Question 13");        
        System.out.println("Your Array Values in Reverse are: ");
     
        for (int e = values.length; e > 0; e--)
        {
            System.out.println(values[e - 1]); 
            
        } // End of for Statement.

        sp();
        
    } // End of question13.    
 
        /**
         * Question 14 - Using a for loop, print every other number in the array
         */
    public static void question14(int[] values) {
        
        System.out.println("Question 14");
        System.out.println("Every Other of Your Array Values are: ");
     
        for (int i = 0; i < values.length; i = i + 2)
        {
            System.out.println(values[i]);            
        } // End of for Statement.
        
        sp();
        
    } // End of question14.
        
        /**
         * Question 15 - Using a for loop, print every other number in the array in reverse
         * order
         */
    public static void question15(int[] values) {

        System.out.println("Question 15");
        System.out.println("Every Other of Your Array Values in Reverse are: ");
     
        for (int e = values.length; e > 0; e = e - 2)
        {
            System.out.println(values[e - 1]);            
        } // End of for Statement.
        
        sp();

    } // End of question15. 
        
        /**
         * Question 16 - Using an enhanced for loop, print every element in the array
         */
        public static void question16(int[] values) {

        System.out.println("Question 16");
        System.out.println("Your Array Values are: ");
     
        for (int value : values)
        {
            System.out.println(value);
            
        } // End of for Statement.
        
        sp();
        
    } // End of question16.

        /**
         * Question 17 - Using an enhanced for loop, add up all the elements in the array
         * and print the sum to the screen
         */
    public static void question17(int[] values) {

        System.out.println("Question 17");
        System.out.println("Your Array Value Total is: ");
     
        int sum = 0;
        
        for (int value : values)
        {
            sum = sum + value;
        
        }
        System.out.println(sum);
        sp();
        
        // End of for Statement.
        
    } // End of question17.
        
        /**
         * Question 18 - Using array methods, print the size of the array to the screen
         */
    public static void question18(int[] values) { 
        
        System.out.println("Question 18");
        System.out.println("The Total amount of Values in your Array is: ");
        System.out.println(values.length + "\n");
        
    } // End of question18..

        /**
         * Question 19 - Using an enhanced for loop, find the average number in the array 
         * and print it to the screen
         */
    public static void question19(int[] values) {

        System.out.println("Question 19");
        System.out.println("Your Array Value Total is: ");
     
        int sum = 0;
        
        for (int value : values)
        {
            sum = sum + value;
        
        }
        System.out.println(sum / values.length);
        sp();
        
        // End of for Statement.
        
    } // End of question19.
        
        /**
         * Question 20 - Create an array of Strings that holds the days of the week
         * i.e. position 0 = Monday, 1=Tuesday, etc...
         */
    public static void question20() {

        System.out.println("Question 20");
     
        // Declare an array
        String[] weekDays;
       
        // Declares an Arrays Memory
        weekDays = new String[7];
        
          weekDays[0] = "Monday";
          weekDays[1] = "Tuesday";
          weekDays[2] = "Wednesday";
          weekDays[3] = "Thursday";
          weekDays[4] = "Friday";
          weekDays[5] = "Saturday";
          weekDays[6] = "Sunday";
        
        System.out.println("Your Array of Strings are Created\n");
        
        question21(weekDays);
                
    } // End of question20.    
             
        /**
         * Question 21 - Prompt the user to enter a number between 1-7 and have use 
         * the array from the last question to display the day of the week
         * For example if the user enters 3, the program should print Wednesday 
         * to the screen
         */
    public static void question21(String[] weekDays) {

        System.out.println("Question 21");
        
        // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        // Wait for the user to enter a line of text.
        int week = 0;
        boolean isValid = true;
        
        while(isValid){
            System.out.print("Please Enter a Number between 1-7... or 99 to exit: ");
            week = keyboard.nextInt();
            if(week > 0 && week < 8){
                System.out.println("You have selected " + weekDays[week - 1] + "... Great choice! \n");
                
            }
            else if(week == 99){
                isValid = false;
                System.out.println("Thanks for using our software!\n");
            }
            else{
                System.out.println("Please enter a valid option.\n");
            }
        }
                
    } // End of question21. 
        
        /**
         * Question 22 - Create an ArrayList to store Integers
         */
    public static void question22() {

        System.out.println("Question 22");
     
        // Declare an ArrayList
        ArrayList<Integer> IntegersArray = new ArrayList<Integer>();
        
        System.out.println("Your array list has been declared.\n");
        
        question23(IntegersArray);
        question24(IntegersArray);
        question25(IntegersArray);
        question26(IntegersArray);
                
    } // End of question22.
        
        /**
         * Question 23 - Add the following numbers to the ArrayList (10,3,4,77,89,90,91)
         */
    public static void question23(ArrayList<Integer> IntegersArray) {

        System.out.println("Question 23");

        IntegersArray.add(10);
        IntegersArray.add(3);
        IntegersArray.add(4);
        IntegersArray.add(77);
        IntegersArray.add(89);
        IntegersArray.add(90);
        IntegersArray.add(91);
        
        System.out.println("Your numbers have been appended.\n");
                
    } // End of question23.    
        
        /**
         * Question 24 - Using an enhanced for loop, print the sum of the numbers to the screen
         */
    public static void question24(ArrayList<Integer> IntegersArray) {

        System.out.println("Question 24");
     
        int sum = 0;
        
        for (int value : IntegersArray)
        {
            sum = sum + value;
        }
        System.out.println("The sum of the ArrayList is: " + sum + "\n");
           
        // End of for Statement.
        
    } // End of question24.
        
        /**
         * Question 25 - Display the maximum number in the ArrayList
         */
    public static void question25(ArrayList<Integer> IntegersArray) {

        System.out.println("Question 25");
     
        int greatestInteger = -1;
        
        for (int value : IntegersArray)
        {
            if(value > greatestInteger)
            {
                greatestInteger = value;
            }
        }
        System.out.println("The greatest number is: " + greatestInteger + "\n");
           
        // End of for Statement.
        
    } // End of question24.
        
        /**
         * Question 26 - Display the minimum number in the ArrayList
         */
    public static void question26(ArrayList<Integer> IntegersArray) {

        System.out.println("Question 26");
     
        int minimumInteger = 9999999;
        
        for (int value : IntegersArray)
        {
            if(value < minimumInteger)
            {
                minimumInteger = value;
            }
        }
        System.out.println("The minimum number is: " + minimumInteger + "\n");

    } // End of question26.    
        
        /**
         * Question 27 - Create a Random integer between 1-10 and store it in a variable
         */
    public static void question27() {

        System.out.println("Question 27");
        
        int randomVariable = 1 + (int)(Math.random() * ((10 - 1) + 1));
        
        System.out.println("The random number is: " + randomVariable + "\n");
        
        question28(randomVariable);
        question29(randomVariable);
        
    } // End of question26.      
        
        /**
         * Question 28 - Create a while loop that will keep prompting the user to guess
         * the random number (be sure to tell the user, the range is 1-10).
         * When the number is guessed print "You guessed it" to the screen
         */
    public static void question28(int randomVariable) {

        System.out.println("Question 28");
        
        // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        int guess = 0;
        
        boolean isValid = true;

        while(isValid){
            
            System.out.print("Guess a number between 1 and 10 OR enter 99 to give up: ");
            guess = keyboard.nextInt();
            
            if(guess > 0 && guess < 11){
                if(guess == randomVariable){
                    System.out.println("You got it!\n");
                    isValid = false;
                }
                else{
                    System.out.println("Guess was incorrect.\n");
                }
            }
            else if(guess == 99){
                isValid = false;
                System.out.println("Thanks for using our software!\n");
            }
            else{
                System.out.println("Guess was not between 1-10.\n");
            }
        } // End of while Statement.
         
    } // End of question28.
        
        /**
         * Question 29 - Rewrite the code from the previous question to track how many 
         * times it took the user to guess the random number.  Once complete
         * display the answer to the screen.
         */
    public static void question29(int randomVariable) {

        System.out.println("Question 29");
        
        // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        int guess;
        int guesses = 0;
        
        boolean isValid = true;

        while(isValid){
            
            System.out.print("Guess a number between 1 and 10 OR enter 99 to give up: ");
            guess = keyboard.nextInt();
            guesses++;
            
            if(guess > 0 && guess < 11){
                if(guess == randomVariable){
                    System.out.println("You got it in " + guesses + " tries!\n");
                    isValid = false;
                }
                else{
                    System.out.println("Guess was incorrect.\n");
                }
            }
            else if(guess == 99){
                isValid = false;
                System.out.println("Thanks for using our software!\n");
            }
            else{
                System.out.println("Guess was not between 1-10.\n");
            }
        } // End of while Statement.
       
    } // End of question29.   
        
        /**
         * Question 30 - Create an ArrayList that can store Strings
         */
    public static void question30() {

        System.out.println("Question 30");
        
        // Declare an ArrayList
        ArrayList<String> StringArray = new ArrayList<String>();
        
        System.out.println("Your array list has been declared.\n");
        
        question31(StringArray);
        question32(StringArray);
        question33(StringArray);
        question34(StringArray);
       
    } // End of question30. 
        
        /**
         * Question 31 - Add the names of each course you are taking in the 
         * ArrayList
         */
    public static void question31(ArrayList<String> StringArray) {

        System.out.println("Question 31");

        StringArray.add("Java");
        StringArray.add("HTML and CSS");
        StringArray.add("Internet of Things");
        StringArray.add("Communication Essentials");
        StringArray.add("Math");
        StringArray.add("Human Behaviour");
        
        System.out.println("Your courses have been installed.\n");
                
    } // End of question31.    
        
        /**
         * Question 32 - using a while loop, print out the elements of the 
         * ArrayList from the previous question
         */
    public static void question32(ArrayList<String> StringArray) {

        System.out.println("Question 32");
        
        int i = 0;
        
        while (StringArray.size() > i) {
            System.out.println(StringArray.get(i));
            i++;                    
        }  
      
        sp();
                
    } // End of question32.    
    
        /**
         * Question 33 - print the size of the ArrayList and then 
         * remove the last 2 elements of the ArrayList
         */
    public static void question33(ArrayList<String> StringArray) {

        System.out.println("Question 33");
        System.out.println("Current Array Size: " + StringArray.size());
        
        StringArray.remove(5);
        StringArray.remove(4);

        System.out.println("Successfully removed 2 items.\n");
                
    } // End of question33.

        /**
         * Question 34 - print the size of the ArrayList, confirm that
         * it went down by 2
         */
    public static void question34(ArrayList<String> StringArray){ 
        
        System.out.println("Question 34");        
        System.out.println("New Array size is: " + StringArray.size() + "\n");

    } // End of question34.  
        
        /**
         * Question 35 - Create a short program that will prompt the user
         * to enter the temperature outside.  If it is less than 0, print 
         * "brrr...time for a coat".  If it is above 0, but less than 18
         * print "might need a sweater".  If it is above 18, print 
         * "time for the beach"
         */
    public static void question35(){
        
        System.out.println("Question 35");
        System.out.print("Please Enter a Temperature: ");
        
         // Create Scanner Object.
        Scanner keyboard = new Scanner(System.in);
        
        double userInput = keyboard.nextDouble();
        
        if (userInput <= 0){
            System.out.println("Brrr...time for a coat.\n");
        }
        else if (userInput > 0 && userInput <= 18){
            System.out.println("Might need a sweater.\n");
        }
        else {
        System.out.println("Time for the beach.\n");
        }        
    }
  
} // End of Class