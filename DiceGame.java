import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int computerScore = 0;
    int userScore = 0;

    System.out.println("How many times do you want to play with the computer?");
    int numberOfGames = scanner.nextInt();
    
    NumberOnDice a = new NumberOnDice();

    for (int i=1; i<=numberOfGames; i++)
    {
        a.user = random.nextInt(6) + 1;
        a.computer = random.nextInt(6) + 1;

        System.out.println("---------------");
        System.out.println(i + " ROLL OF DICE");
        System.out.println("---------------");
        System.out.println("You: " + a.user);
        System.out.println();
        a.viewUser();
        System.out.println();
        System.out.println("Computer: " + a.computer);
        System.out.println();
        a.viewComputer();
        System.out.println();

        //this instruction check which number is greater
        if (a.user < a.computer) 
        {
            System.out.println("Computer WON!");
            computerScore += 1;
        }
        
            else if (a.user > a.computer)
            {
                System.out.println("You WON!");
                userScore += 1;
            }

            else if (a.user == a.computer)
                System.out.println("Draw!");
    }

    System.out.println("--------------------------------");
    System.out.println("FINAL SCORE: You " + userScore + " - " + computerScore + " Computer");
    System.out.println("--------------------------------");
    
    }

}

class NumberOnDice 
{
    int user;
    int computer;

    //a method that displays on screen appropriate "dice" for user
    void viewUser()
    {

        if (user == 1)
        {    
            System.out.println("# # # # #");
            System.out.println("#       #");
            System.out.println("#   @   #");
            System.out.println("#       #");
            System.out.println("# # # # #");
        }
            else if (user == 2)
            {
                System.out.println("# # # # #");
                System.out.println("#     @ #");
                System.out.println("#       #");
                System.out.println("# @     #");
                System.out.println("# # # # #");
            }

            else if (user == 3)
            {
                System.out.println("# # # # #");
                System.out.println("#     @ #");
                System.out.println("#   @   #");
                System.out.println("# @     #");
                System.out.println("# # # # #");
            }

            else if (user == 4)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("#       #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }

            else if (user == 5)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("#   @   #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }

            else if (user == 6)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("# @   @ #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }
    }

    ////a method that displays on screen appropriate "dice" for computer
    void viewComputer()
    {

        if (computer == 1)
        {    
            System.out.println("# # # # #");
            System.out.println("#       #");
            System.out.println("#   @   #");
            System.out.println("#       #");
            System.out.println("# # # # #");
        }
            else if (computer == 2)
            {
                System.out.println("# # # # #");
                System.out.println("#     @ #");
                System.out.println("#       #");
                System.out.println("# @     #");
                System.out.println("# # # # #");
            }

            else if (computer == 3)
            {
                System.out.println("# # # # #");
                System.out.println("#     @ #");
                System.out.println("#   @   #");
                System.out.println("# @     #");
                System.out.println("# # # # #");
            }

            else if (computer == 4)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("#       #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }

            else if (computer == 5)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("#   @   #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }

            else if (computer == 6)
            {
                System.out.println("# # # # #");
                System.out.println("# @   @ #");
                System.out.println("# @   @ #");
                System.out.println("# @   @ #");
                System.out.println("# # # # #");
            }
    }
            
        

}
