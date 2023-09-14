/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;
/**
 *
 * @author mwhite23
 * This program
 * 1.Let the user choose the type of candy
 * 2.Enter the number of candies they ate
 * 3.Report the number of total calories consumed
 */
public class Assignment1 {
 
/**
 
* @param args the command line arguments
 
*/
 
public static void main(String[] args) {
 
    //Declare calorie per candy based on the servings per bag
    int taro = (360*10)/150;
    double poi = (550.*8.)/125.;
    int ube = (650*10)/100;

    //Declare input variables
    int candy;
    int count;


    //Intro design
    System.out.println("***************Malia's Candy Calorie Counter************");
    System.out.println("1. Taro \n2. Poi \n3. Ube \n4. Exit");

 
    //Collect type of candy they have eaten
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Select the tpe of candy you have eaten:"); 
    candy = keyboard.nextInt(); 


    //Create a switch statement to validate chosen values or end if not a valid value
    switch(candy)
    {
        case 1:
            System.out.println("How many candies did you eat?");
            count = keyboard.nextInt();

            double totalCalories = taro * count;

            System.out.printf("Calories consumed: %.0f\n", totalCalories);
            break;
        case 2:
            System.out.println("How many candies did you eat?");
            count = keyboard.nextInt();

            totalCalories = poi * (double)count;

            System.out.printf("Calories consumed: %.0f\n" , totalCalories);
            break;
            
        case 3:
            System.out.println("How many candies did you eat?");
            count = keyboard.nextInt();

            totalCalories = ube * count;

            System.out.printf("Calories consumed: %.0f\n", totalCalories);
            break;
        
        case 4:
            System.out.println("Thanks for your time!");
            break;
        
        default:
            System.out.println("You have not chosen a valid value, goodbye.");
            break;
    } 
}
}

