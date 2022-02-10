package infosys.demo.controlstructures;

import java.util.Scanner;

public class DoWhileLoopDemo2 {

	public static void main(String[] args) {
		
		String reply="";
        int num=0;
        int sum=0;
        Scanner scan=new Scanner(System.in);
        do
        {
        	System.out.println("Enter the number");
            num=scan.nextInt();
            //sum=sum+num;
             sum+=num; // compound assignment operator
             System.out.println("Do you want to continue?");
             reply=scan.next();
        }while(reply.equalsIgnoreCase("yes"));
	   System.out.println("The sum of entered number "+sum);
	}

}
