// q1
// create a class  Calculator,ScCalculator and HybridCalculator  
// then group them into a package

package calc;


//                      ek class calculator bnaey gay or uss me khud say koi method bna day gay
class Calculator{
    public void calculate(int a, int b){
 System.out.println("your result is " + a+b);
    }
}

//                     ek class ScCalculator bnaey gay or uss me koi method add day gay
class ScCalculator{
    public void calculate(int a, int b){
 System.out.println("your result is " + Math.sin(a+b));
    }
}

//                    ek class HybridCalculator bnaey gay or uss me koi method add kr dy gy    
class HyCalculator{
    public void calculate(int a, int b){
 System.out.println("your result is " + a+b);
 System.out.println("your result is " + Math.sin(a+b));
    }
}

public class ProblemOne{
  

 public static void main(String[] args) {
      System.out.println("i am main method");




    }

       }







