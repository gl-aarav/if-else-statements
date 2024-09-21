import java.util.Scanner;
public class Q4 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int integer1, integer2, difference;
    System.out.print("\nEnter a positive integer: ");
  integer1 = in.nextInt();
    System.out.print("\nEnter another positive integer: ");
  integer2 = in.nextInt();
  difference = integer1 - integer2;
    if (difference < 0)
  System.out.println("\nYour smaller number is " + integer1 + " and your bigger number is " + integer2 + ".");
    else if (difference == 0)
  System.out.println("\nYour smaller number and your bigger number are equal to " + integer1);
    else
  System.out.println("\nYour smaller number is " + integer2 + " and your bigger number is " + integer1 + ".");
  }
}