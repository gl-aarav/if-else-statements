import java.util.Scanner;
public class Q2 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int integer;
  System.out.print("Enter a positive integer: ");
    integer = in.nextInt();
    integer = integer%2;
    if (integer==1)
      System.out.println("Your number is odd!");
    else 
      System.out.println("Your number is even!");
    
  }
}