package se283.a1.t1;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
import se283.a1.t1.Reflector;
import java.util.Scanner;

/**
 * SE283 Assignment 1 Task 1 Main - Instructions 
 * 
 * This class should be implemented to accept the user input 
 * through args[] and delegate the reflection functionality to class Reflector. 
 * 
 * You may implement additional classes if you wish, but this class should be the main program entry
 * point.
 * 
 * You must STAGE, COMMIT and PUSH your changes every time you are 
 * "done" (see the "definition of done" in Agile/Scrum/XP) with writing/changing this class, i.e. 
 * after successfully completing Task 1, Task 2 and Task 3, respectively
 * You may COMMIT and PUSH prematurely too i.e. before each task is completed, but 
 * you "must" COMMIT and PUSH to the remote repo after finishing each of the A1 tasks.
 * 
 * @author Author Name: Maryam Zehra Author UPI: mzeh273
 * @version Date: 05/08/2021
 */

public class T1Main {
	public static void main(String[] args) {


		//setup scanner to read inputs
        Scanner sc = new Scanner(System.in);
		
        //take first input of class
		System.out.print("Enter class name- ");  
        String inputClass = sc.nextLine();
        
        //Create instance
        Reflector newReflector = new Reflector();
        newReflector.name = inputClass;
        
        // create never-ending loop
        while (true) {
            // clear scanner
            sc.reset();
            // Print required fields and methods
            newReflector.printFields();
            newReflector.printMethods();

            // Take and scan chosen input method
            System.out.println("Choose a method-");
            String inputMethod = sc.nextLine();

            // execute method on created instance
            newReflector.execute(inputMethod);

        }
        }

	}

