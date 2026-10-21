import java.util.Scanner;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random random = new Random();
        
    //lottery array to store 5 random integers
    int [] lottery = new int[5];    
    //for loop to generate random integer 0-9 for each array element
    for (int i = 0; i < lottery.length; i++){
        lottery[i] = random.nextInt(10);
    }

    int [] user = new int[5];
    
    System.out.println("Please enter your 5 lottery numbers (0-9)");
    for (int i = 0; i < user.length; i++){
       boolean invalid = true;
       int number = 0;

       while(invalid){
        System.out.print("Digit " + (i+1) + ": ");
        number = keyboard.nextInt();
     
       if (number >= 0 && number <= 9){
        user[i] = number;
        invalid = false;
       }
       else{ 
        System.out.println("Invalid Input. Please enter values 0-9");
      }
    } 
  }
     
    //for loop to compare array elements and count matching numbers
    int matchingNumbers = 0;
    for (int i = 0; i < 5; i++){
        if(lottery[i] == user [i]){
           matchingNumbers++;
        }
    }
    
    System.out.println();
    //for loop displaying lottery array elements
    System.out.print("Lottery numbers: ");
    for (int i = 0; i < lottery.length; i++){
        System.out.print(lottery[i] + " ");
    }
    
    System.out.println();
    //for loop displaying user array elements
    System.out.print("Your numbers:    ");
    for (int i = 0; i < user.length; i++){
        System.out.print(user[i] + " ");
    }

    System.out.println();
    //if statement to determine whether or not user matched all 5 digits
    System.out.println("Matching digits: " + matchingNumbers);
    if (matchingNumbers == 5){
        System.out.println("Congratulations! You are the grand-prize winner!");
    }
    
    keyboard.close();
    
    }//end of main method
}//end of public class
