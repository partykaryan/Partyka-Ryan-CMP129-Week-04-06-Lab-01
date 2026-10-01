import java.util.Scanner;
public class DriversLicenseExam {

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
String answer;
int correctAmount = 0;
int incorrectAmount = 0;   

//Array for storing correct answers
char [] correctAnswers = { 'A' , 'D', 'B', 'B', 'C' , 'B' , 'A' , 'B' ,
 'C', 'D' , 'A' , 'C' , 'D' , 'B' , 'D' , 'C' , 'C' , 'A' , 'D' , 'B'
};

//Second Array for Student answers
char [] studentAnswers = new char[20];


System.out.println("Please Answer A, B, C, or D to the following questions");
//for loop to allow user to input answers
for (int i = 0; i < studentAnswers.length; i++){
    
    System.out.print("Question " + (i+1) + ":");
    answer = keyboard.nextLine();
    answer.toUpperCase();//ensures that program will accept both lower case and capital letters
}

//for loop to compare indexes of each Array 
for (int i = 0; i < 20; i++){
if (correctAnswers[i] == studentAnswers[i])
    correctAmount++;//counts the correct answers
else
    incorrectAmount++;//counts the incorrect answers
}

System.out.println("Correct Answers: " + correctAmount);
System.out.println("Incorrect Answers: " + incorrectAmount);

//if else statement to determine if student passed or failed
if (correctAmount >= 15)
   System.out.println("Result: Pass");
else   
System.out.println("Result: Fail");

System.out.println("Questions answered incorrectly: ");

//for loop to determine which questions were answered incorrectly
for (int i = 0; i <20; i++){
    while(correctAnswers[i] != studentAnswers[i])
    
        System.out.println("Question " + (i+1) + " is incorrect");
    }

keyboard.close();

}//end of main method
}//end of public class
