package infosys.demo.conversioncasting;

public class Demo2 {

	public static void main(String[] args) {
	
		  double d=12.34;
		  //int num=d;
		  // cannot convert from double to int
		  // So what is the solution?
		  // we will forcefully convert the double
		  // into int and in that process data will be
		  // lost but we are knowing what we are doing 
		  // and being coder we are ok with it
		 int num=(int)d;
		 System.out.println(num);

	}

}
