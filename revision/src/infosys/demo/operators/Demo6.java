package infosys.demo.operators;

public class Demo6 {
	public static void main(String args[]) {
		int numOne = 10;
		int numTwo = 500;
		System.out.println(numOne > numTwo); //Output will be true
		boolean b=numOne>numTwo;
		System.out.println(b);
		if(numOne>numTwo)
		{
			System.out.println("numOne is greater than numTwo");
		}
		else {
			System.out.println("numTwo is greater than numOne");
		}
	 System.out.println(numOne==numTwo); // false
	 System.out.println(numOne!=numTwo); // true
	 System.out.println(numOne=numTwo);   //500
	 System.out.println(numOne);   //500
	 System.out.println(numTwo);   //500
	 System.out.println(numOne>=numTwo);  //true
	 
	}

}
