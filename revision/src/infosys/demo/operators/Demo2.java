package infosys.demo.operators;

public class Demo2 {

	public static void main(String[] args) {
	
		int num=10;
		int num2=10;
		System.out.println(num++); //10
		// In line 9, first the variable num is 
		// displayed because of System.out.println
		// and then the value within num which is 10
		// is incremented
		System.out.println(num);  //11
		// In line 14th now we are able to see the
		// incremented value
	    System.out.println(++num2); //11
	    // In line 17, first num2's value which is 10
	    // gets incremented by 1 and then it is displayed
	    System.out.println(num2);  //11
       
       
	}

}
