import java.util.Scanner;
public class Q5{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
System.out.println("\nHello! Welcome to the local art museum!");
System.out.println("Here is the pricing:");
System.out.println("\nChildren under 5: free");
System.out.println("65 years and older: $1.50");
System.out.println("All others: $2.50");
int age;
System.out.println("\nWhat is your age?");
age = in.nextInt();
    if (age>0 && age<5)
      System.out.println("Your ticket is free!");
    else if (age>=65)
      System.out.println("Your ticket price is $1.50");
    else 
      System.out.println("Your ticket price is $2.50");
  }
}