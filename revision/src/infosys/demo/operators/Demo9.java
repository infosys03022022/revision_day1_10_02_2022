package infosys.demo.operators;

public class Demo9 {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int num3=2;
		int result=num1+num2/num3;
		// num2/num3 10
		// num1+10 10+10
		// result will have 20
		System.out.println(result); //20
		  result=(num1+num2)/num3;
		// (num1+num2) ==> 10+20=30
		 // 30/2  ==> 15
		System.out.println(result);  //15
		

	}

}
