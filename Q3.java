import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
int wordsentered;
double cost;

    System.out.println("How many words does your telegram have.");
    wordsentered = in.nextInt();
  
      if (wordsentered > 15) {
        cost = (wordsentered -15) * 0.25 + 8.5;
        System.out.printf("The cost of your telegram is $%.2f%n", cost);
      }
      else if(wordsentered<=0){
        System.out.println("Enter a number that makes sense please.");
      }
      else {
        System.out.println("The cost of your telegram is $8.50");
      }

  }
}