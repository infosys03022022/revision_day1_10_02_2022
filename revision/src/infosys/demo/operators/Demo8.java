package infosys.demo.operators;

public class Demo8 {
	public static void main(String args[]) {
		int numOne = 10;
		int numTwo = 5;
		int min = (numOne < numTwo) ? numOne : numTwo;
		System.out.println(min); //Output will be 5
		if(numOne<numTwo)
		{
			min=numOne;
		}
		else {
			min=numTwo;
		     }
		System.out.println(min);
	}

}
