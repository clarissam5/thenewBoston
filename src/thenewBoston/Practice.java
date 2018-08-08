package thenewBoston;
/*
Here is the collection of notes and examples compiled 
from watching the "thenewboston" videos.
-
Author:Clarissa Mercado
Date:08-01-18
*/
import java.util.Scanner;
public class Practice {
/*//(6) Getting User Input:
	public static void main (String args[]) {
		Scanner bucky = new Scanner(System.in);
			//this will print the inputed information from keyboard
			System.out.println(bucky.nextLine());	
	}
*/	
/*// (7) Building a Basic Calculator:
	public static void main (String args[]){
		Scanner bucky = new Scanner(System.in);
			double fnum, snum, answer;
			System.out.println("Enter first num: ");
			fnum = bucky.nextDouble();
			System.out.println("Enter second num: ");
			snum = bucky.nextDouble();
			answer = fnum + snum;
			System.out.println(answer);
	}
*/
/*// (8) Math Operators:	
	public static void main (String args[]){
		Scanner bucky = new Scanner(System.in);
			double girls, boys, people;
			girls = 6;
			boys = 4;
			// % = remainder 
			people = girls % boys;
			System.out.println(people);
	}
*/
/*// (9) Increment Operators
	public static void main (String args[]){
		Scanner bucky = new Scanner(System.in);
			int flower = 6;
			int rose = 4;
			//rose = rose + 2
			rose +=2;
			System.out.println(flower++);
			//adds 1 after it printed 
			System.out.println(flower);
			System.out.println(rose);
	}
*/
/*// (10) If Statement 
	public static void main (String args[]) {
		int test = 6;
		//() what you're testing, has two choices for now
		if (test == 9) {
			System.out.println("yes");
		}else {
			System.out.println("this is else");
		}
	}
*/
/*// (11) Logical Operators 
	public static void main (String args[]) {
		int boy, girl;
		boy = 18;
		girl = 68;
		//only one side of the | has to be true to enter the first statement
		if(boy>10 || girl<60) {
			System.out.println("You can enter");
		}else {
			System.out.print("You can not enter");
		}
	}
*/
/*// (12) Switch Statement 
	public static void main (String args[]) {
		int age; 
		age = 3;
		
		switch (age) {
		case 1: 
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can walk");
			break;
		case 3:
			System.out.println("You can get into trouble");
			break;
		//if none of the values above are true
		default:
			System.out.print("I don't know how old you are");
		break;
		}
	}
*/
/*// (13) While Loops
	public static void main (String args[]) {
		int counter = 0;
		// () dictates how many times the statement in the {} will run
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}
	}
*/
/*// (14) Using Multiple Classes 	- in conjunction with Practiceclass
	public static void main (String args[]) {
		Practiceclass firstobject = new Practiceclass();
		//"." dot separator then type method name 
			firstobject.Message();
	}
*/
/*// (15) Use Methods with Parameters
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		//creating object for other class to connect to other 
		Practiceclass obj = new Practiceclass();
		
		System.out.println("Enter name here: ");
		String name = input.nextLine();
		
		//call method, have to put argument because we want to do something with name
		//in class Practiceclass used to run methods 
		obj.simpleMessage(name);
	}
*/	
}
