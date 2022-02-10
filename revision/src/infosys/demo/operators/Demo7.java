package infosys.demo.operators;

public class Demo7 {

	
		public static void main(String args[]) {
			int numOne = 2000;
			int numTwo = 2000;
			int numThree = 2000;
			System.out.println(numOne > numTwo && numOne > numThree); //Output will be true
		
        if(numOne>numTwo && numOne>numThree)
        {
        	System.out.println("numOne is the largest number out of 3 numbers");
        }
        else if(numTwo>numOne && numTwo>numThree)
        {
        	System.out.println("numTwo is the largest number");
        }
        else if(numOne==numTwo && numTwo==numThree)
        	
        {
         System.out.println("All the variables are equal");  	
        }
        else
        {
         System.out.println("num3 is the largest");
        }
        

	}

}
