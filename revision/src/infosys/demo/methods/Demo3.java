package infosys.demo.methods;
    
    public class Demo3 {
      
     static void add(int num1, int num2){
       int result=num1+num2;
       System.out.println(result);
     }
    
    // static methods cannot access non static
     // methods
     public static void main(String args[]) {
        add(1,2);
     }
   }