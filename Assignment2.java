import java.util.*;
import java.util.Random;
/**
 *
 * @author marisangelique
 * This program
 * 1. Displays a 4 choice menu for users to chose from
 * 2.Takes the users input
 * 3.Generates random math problems
 * 4.Validates their input
 * 5.Displays how many they got correct
 * 6.Repeats this process until they exit
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create new instance of the Scanner class to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //Create variables for the program
        int selection; //For user selection from the menu
        int questions = 10; //Parameter for the number of questions for each method
        
        //Create a loop that will display the menu until exit
        do{
            //Displays option menu
            System.out.println("********** Math Quiz Practice **********\n"
                                + "Test Your math skills:\n"
                                + "1. Addition\n"
                                + "2. Subtraction\n"
                                + "3. Multipication\n"
                                + "4. Exit\n"
                                + "Select 1-3 to get 10 math problems, 4 to exit the program");

            //Create variable to store user input
            selection = keyboard.nextInt();
        
       
        
            //Switch to call methods based on selection
            switch(selection)
            {
                case 1: 
                    additionProblems(questions);
                    break;
                case 2:
                    subtractionProblems(questions);
                    break;
                case 3:
                    multipicationProblems(questions);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please select 1-3 for practice problems or 4 to exit");
            }
            
        }while (selection != 4);
        
        
    }
    
    //Method for addition problems that return the number of correct answers
    public static void additionProblems(int questions){
        //Create new instance of the Scanner class to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Create a new instance of the Randpm class to generate random numbers
        Random random = new Random();
        //Create variable for the method
        int userAnswer; //Holding user answer to questions
        int correctAnswers = 0; //Initializing correct answers
        
        
        
        //Create loop for a total of 10 questions that counts the number of correct answers
        for(int i =0; i<questions; i++){
            //Variables to hold and generate random numbers, inside the loop to generate new numbers each loop
            int num1 = random.nextInt(51);
            int num2 = random.nextInt(51);
            
            int answer = num1 + num2; 
            
            System.out.println("What is "+ num1 + " + " + num2 +"?");
            userAnswer = keyboard.nextInt();
            
            if(userAnswer == answer){
                correctAnswers++;
                System.out.println("Nicee");
            }else{
                System.out.println("That is inncorrect.");
            }
        }
        
        
        //Display # of answers correct
        System.out.println("You got "+ correctAnswers + " answer(s) correct");
    }
    
    //Method for subtraction problems that return the number of correct answers
    public static void subtractionProblems(int questions){
         //Create new instance of the Scanner class to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Create a new instance of the Random class to generate random numbers
        Random random = new Random();
        //Create variable for the method
        int userAnswer; //Holding user answer to questions
        int correctAnswers = 0; //Initializing correct answers
        
        
        
        //Create loop for a total of 10 questions that counts the number of correct answers
        for(int i =0; i<questions; i++){
            //Variables to hold and generate random numbers, inside the loop to generate new numbers each loop
            int num1 = random.nextInt(51);
            int num2 = random.nextInt(51);
            
            int answer = num1 - num2; 
            
            System.out.println("What is "+ num1 + " - " + num2 +"?");
            userAnswer = keyboard.nextInt();
            
            if(userAnswer == answer){
                correctAnswers++;
                System.out.println("Nicee");
            }else{
                System.out.println("That is inncorrect.");
            }
        }
        
        
        //Display # of answers correct
        System.out.println("You got "+ correctAnswers + " answer(s) correct");
    }
    
    //Method for multipication problems that return the number of correct answers
    public static void multipicationProblems(int questions){
                 //Create new instance of the Scanner class to read keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Create a new instance of the Randpm class to generate random numbers
        Random random = new Random();
        //Create variable for the method
        int userAnswer; //Holding user answer to questions
        int correctAnswers = 0; //Initializing correct answers
        
        
        
        //Create loop for a total of 10 questions that counts the number of correct answers
        for(int i =0; i<questions; i++){
            //Variables to hold and generate random numbers, inside the loop to generate new numbers each loop
            int num1 = random.nextInt(51);
            int num2 = random.nextInt(51);
            
            int answer = num1 * num2; 
            
            System.out.println("What is "+ num1 + " x " + num2 +"?");
            userAnswer = keyboard.nextInt();
            
            if(userAnswer == answer){
                correctAnswers++;
                System.out.println("Nicee");
            }else{
                System.out.println("That is inncorrect.");
            }
        }
        
        
        //Display # of answers correct
        System.out.println("You got "+ correctAnswers + " answer(s) correct");
    }
    
  
    
}
