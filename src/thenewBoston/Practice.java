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
/*// (16) Many Methods and Instances 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Practiceclass object = new Practiceclass();
		System.out.println("Enter name: ");
		String temp = input.nextLine();
		object.setName(temp);
		//the below will be the string in print saying plus the input form the user 
		object.saying();
		
	}*/
/*// (17) Constructors
	public static void main(String args[]) {
		Practiceclass object = new Practiceclass ("Clarissa");
		object.saying();
	}*/
/*// (18) (19) Nested if Statements
	public static void main(String args[]) {
		int age = 60;
		
		if (age < 50) {
			System.out.println("You are young");
		} 
		else if (age >= 50) 
			System.out.println("You are in your 50s");
			if (age > 75) {
				System.out.println("you are really old");
			} else {
				System.out.println("You are wise.");
			}
		}*/
	
/*// (20) Conditional Operators
	public static void main(String args[]) {
		int age = 20;
		//Asked a question, answer is yes or not, then after the question mark
		//It shows the first option if the question is true, if the question is false the 2nd state
		System.out.println(age > 50 ? "You are old" : "You are young");
		
	}*/
/*// (21) Simple Averaging Program 	
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		int total = 0; 
		int grade; 
		int average;
		int counter = 0;
			
		while (counter < 10 ) { //what do we want to do 10 times
			grade = input.nextInt(); //input 10 grades
			total = total + grade; //adding them all up 
			counter ++;
		}
		average = total/10;
		System.out.println("Your average is " + average);
	}*/
/*// (22) For Loops
	public static void main(String args[]) {
		for (int counter = 1; counter <= 10; counter++ or counter +=3 ) {//takes 3 arguments: where it starts, where it ends, how much you want to incrememnt by 
				System.out.println(counter);
			}
		}*/
//(23) Compound Interest Program 
	public static void main(String args[]) {
		//A = P(1+ R) ^n
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for(int day = 1; day <=20; day++) {
			amount = principal*Math.pow(1 + rate, day);
			System.out.println(day);
		}
	}
}
