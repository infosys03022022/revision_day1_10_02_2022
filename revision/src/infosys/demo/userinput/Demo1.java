package infosys.demo.userinput;

public class Demo1 {

	public static void main(String[] args) {
		 // Scanner is a predefined class and it is within a predefined package called java.util
		 // As Scanner class is within a package so while mentioning the class name we are
		// specifying the package name also. This way of mentioning the class name alongwith its
		// package is called as Fully Qualified Name of the class (FQN)
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		  int num;
		  System.out.println("Enter the number");
		  num=scanner.nextInt();
         // scanner is an object of Scanner class, and nextInt is a method of Scanner class
		 // so in line 13, we are invoking the nextInt() method through scanner object it. So
		 // when we enter a number from keyboard that number is read/scanned and it gets stored
		 // in the num variable
		 System.out.println("The entered value is "+num);
	}

}
