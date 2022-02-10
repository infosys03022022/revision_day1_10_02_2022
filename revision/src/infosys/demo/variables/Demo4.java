package infosys.demo.variables;

public class Demo4 {

	public static void main(String[] args) {
		//float f=12.34;
	   // 12.34 literal/constant is not a float but
	   // it is a double value
	   // Why double value cannot be assigned to float?
		// Double has 8bytes and float is having 4 bytes
		// so data of 8 bytes cannot be accomodated in
		// the data of 4 bytes
		float data=12.34f;
		float data2=12.34F;
		double data3=12.34;
		// 12.34 as it is double , double can
		// be assigned to a double variable
		
	}

}
