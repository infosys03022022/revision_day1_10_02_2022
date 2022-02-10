package infosys.demo.userinput;

import java.util.Scanner;

// press ctrl+shift+o
public class Demo2 {

	public static void main(String[] args) {
	int roll;
	String name;
	float marks;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the roll");
	roll=scan.nextInt();
	System.out.println("Enter the name");
	name=scan.next();
	System.out.println("Enter the marks");
	marks=scan.nextFloat();
	System.out.println("The details:");
	System.out.println("ROLL "+roll);
	System.out.println("NAME "+name);
	System.out.println("MARKS "+marks);
	
	}

}
