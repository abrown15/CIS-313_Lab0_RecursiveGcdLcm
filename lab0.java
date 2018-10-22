
import java.util.Scanner;                         //import Scanner package
import java.util.Stack;

public class lab0 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int numProblems = scanner.nextInt();          //retrieve the number of lines

    for(int i = 0; i < numProblems; ++i){
      int a = scanner.nextInt();                  //retrieve the first integer
      int b = scanner.nextInt();                  //retrieve the second integer

      int g = gcd(a,b);
      int l = lcm(a,b);

      System.out.println(g + " " + l);
    }

    scanner.close();

    }


 public static int gcd(int a, int b) {
     // Find the greatest common divisor of a and b
     // Hint: Use Euclids Algorithm

     if (b == 0) {
         return a;
     }
     return gcd(b, a % b);
 }


 public static int lcm(int a, int b){
  // Find the least common multiple of a and b
  // Hint: Use the gcd of a and b

     int gcd = gcd(a, b);
     return((a / gcd) * b);
 }

 //Implement a queue using two stacks
 public static void stackQueue(int[] array){

      //Init both stacks
      Stack<Integer> stack_1 = new Stack<Integer>();
      Stack<Integer> stack_2 = new Stack<Integer>();

      //Fill first stack
      for(int i = array.length - 1; i >= 0; i --){
          stack_1.add(array[i]);
      }

      //
     System.out.println(stack_1);
      for(int i = 0; i < array.length; i ++){
          stack_2.add(stack_1.pop());
      }


      //This stack is essentially a queue
      System.out.println(stack_2);


    }

}
