
    package infosys.demo.methods;
    
    public class Demo1 {
      
     void greet(){
       System.out.println("Hello World!!!");
     }
    
    // static methods cannot access non static
     // methods
     public static void main(String args[]) {
       // greet();
     }
   }