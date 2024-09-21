/*
-Name: Aarav Goyal
-Date: 9.19.2023
-Project: If else statements
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   int age, yearsleft;
    String name;
  System.out.println("What is your name?");
  name = in.nextLine();
  System.out.println("What is your age?");
    age = in.nextInt();
    if (age>16)
  System.out.println("It's scary, " + name + " you are old enough to drive!");
      
    else{
      yearsleft = 16-age;
     System.out.println("Sorry you need to wait " + yearsleft + " years to drive a car."); 
    }
  }
}