// 10/6 E: Just opened the file and ready to tackle our first issue, how to accept inputs from users.
//Imports the Scanner class to allow for user input
import java.util.Scanner;

public class Simple_Calculator {
   public static void main(String[] args) {
      //Creates a scanner object that allows the program to accept user input
      Scanner scanner = new Scanner(System.in);
      
      //Takes user input and displays chosen int as a test
      System.out.println("Please enter the first number");
      int num_1 = scanner.nextInt();
      
      System.out.println("You have entered " + num_1); //Test for input
                 
      System.out.println("Please enter the second number");
      int num_2 = scanner.nextInt();
      
      System.out.println("You have entered " + num_2);//Test for input
      
      scanner.nextLine(); //Allows the next scanner.nextLine() to work, DON'T TOUCH
      
      System.out.println("Please enter arithmetic symbol: +, -, *, /, or %");
      String s = scanner.nextLine();
      
      System.out.println(s);
      
      if (s.equals("+")) {// If the entered statement holds one of the symbols, it will excute the one entered
         System.out.println(num_1 + num_2);
      }
      
      if (s.equals("-")) {
         System.out.println(num_1 - num_2);
      }
      
      if (s.equals("*")) {
         System.out.println(num_1 * num_2);
      }
      
      if (s.equals("/")) {
         System.out.println(num_1 / num_2);
      }
      
      if (s.equals("%")) {
         System.out.println(num_1 % num_2);
      }

      
      //Stops scanner from potentially taking inputs when unneccesary
      scanner.close();
   }
}