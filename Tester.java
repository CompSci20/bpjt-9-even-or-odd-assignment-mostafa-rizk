import java.io.*;
import java.util.*;
public class Tester {
   public static void main(String args[]) {
      Scanner kbReader = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int userInt = kbReader.nextInt();
      String oddEven;
      if (userInt % 2 == 0) {
         oddEven = "even";
      }
      else {
         oddEven = "odd";
      }
      System.out.printf("The integer %d is %s.\n", userInt, oddEven);
   }
}
