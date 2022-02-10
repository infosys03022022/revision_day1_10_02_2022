package infosys.demo.controlstructures;
// Can we write default at begining or in between?
// Ans Yes
public class Demo1SwitchCase {

	public static void main(String[] args) {
		int ch=2;
	    switch(ch)
	    {
	    case 1 : System.out.println("One");
	             break;
	    case 2 : System.out.println("Two");
	             break;
	    case 3 : System.out.println("Three");
	             break;
	    default : System.out.println("Your option is wrong!!!");
	    }
	}

}
