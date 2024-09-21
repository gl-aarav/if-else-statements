import java.util.Scanner;
public class Q6{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
int year;
String fruit;
    System.out.print("Enter your birth year: ");
    year = in.nextInt();
    if (year<1970)
    System.out.println("You qualify for the Juke Box Rally.");
in.nextLine();
    System.out.print("Enter your favorite fruit: ");
    fruit = in.nextLine();
    if (fruit.equalsIgnoreCase("strawberry"))
      System.out.println("Strawberry Fields Forever");
    else 
      System.out.println("Bye, bye Miss American Pie");
  }
}