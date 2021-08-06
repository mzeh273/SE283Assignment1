package se283.a1.t1;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



/**
 * SE283 Assignment 1 Task 1 Reflector - Instructions
 *  
 * This class should be implemented to contain the reflection functionality described in the
 * assignment hand-out. 
 * This class must be called by T1Main for executing the desired reflection for a given class e.g. class Counter. * 
 * All changes required for Task 1 must be performed on a new branch named "T1Branch". 
 * You can create this new branch from our IDE.
 * 
 * @author Author Name: Maryam Zehra Author UPI: mzeh273
 * @version Date: 05/05/2021 
 */

public class Reflector {

	// use constructor with input name to load class of the name,
	//create object instance and store fields and methods into separate lists
	String name;
	Class namedClass;

	{
		try {
			namedClass = Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

	Object obj = namedClass;
	Method[] listOfMethods = namedClass.getDeclaredMethods();
	Field[] fieldList = namedClass.getDeclaredFields();


	// method to print fields with their values
	public void printFields() {
		try {
			// for loop goes through individual fields through list
			for (Field field : fieldList) {
				// each iteration of the for loop stores the associated value with the field in a variable
				String value = field.get(obj).toString();

				// both name of field and value are printed together during each iteration

				System.out.println(field.getName());
				System.out.println(value);

			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}


	// method prints the list of methods that do not have parameters
	public void printMethods() {
		try {
			// for loop goes through individual methods through list of all methods
			for (Method method : listOfMethods) {

				// if method does not contain any parameters, method name is printed
				if (method.getParameters().length == 0) {
					System.out.println(method.getName());

				}
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}


	// method executes a method by taking the name of the method as an input string,
	//onto object it is called upon
	public void execute(String inputMethod) {
		try {
			// for loop goes through individual methods from list of methods
			for (Method method : listOfMethods) {
				//if given input method is found, method is invoked onto object instance
				if (method.getName().equals(inputMethod)) {

					method.invoke(obj);
				}
			}

		} catch (Throwable e) {
			System.err.println(e);
		}


	}
}
