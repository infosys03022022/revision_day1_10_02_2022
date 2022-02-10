package infosys.demo.methods;
   // Here we have 2 results variable. Do you think
// both the result variable are same.
// As the variables are in different methods and
// local to those methods , they have local scope

// Instead of having same name to store the added
// value for result can we have different names
// such as result1 and result2
// ans yes.


    public class Demo4 {
      
     static int add(int num1, int num2){
       int result=num1+num2;
       return result;
     }
    
    
     public static void main(String args[]) {
        int result=add(1,2);
        System.out.print(result);
     }
   }