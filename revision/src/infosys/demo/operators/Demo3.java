package infosys.demo.operators;

public class Demo3 {

	public static void main(String[] args) {
	
		int num=10;
		int numIncrement;
		int num2=10;
		int num2Increment;
		numIncrement=num++;
		// 1) numIncrement=num;  // numIcrement is assigned the value of num which is 10
		// 2) num++  // and then num is getting incremented and it gets the value 11
		System.out.println(numIncrement); //10
		System.out.println(num);        //11
		
		num2Increment=++num2;
		// 1) num2 is incremented by 1 so the value of num2 is 11
		// 2) the incremented value of num2 is assigned to num2Increment
		System.out.println(num2);  //11
		System.out.println(num2Increment);  //11
		
       
       
	}

}
