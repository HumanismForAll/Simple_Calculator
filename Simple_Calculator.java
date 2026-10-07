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
      
      System.out.println("Please enter arithmetic symbol: +, -, *, /, or %");
      char symbol = scanner.next().charAt(0);
      
      System.out.println(symbol);
      
      //Stops scanner from potentially taking inputs when unneccesary
      scanner.close();
   }
}
      