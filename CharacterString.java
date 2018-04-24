/*
Create a subroutine that returns the number of characters in the character string passed 
to the subroutine. Display a string and the number of its characters.
*/


import java.util.Scanner;

public class CharacterString 
{
    static int sentence(String a)
    {
	    int b = a.length();
	    return b;
    }

    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any string of characters.");
        
        String c = scanner.nextLine();
        
        System.out.println("Character string: " + c);
	    System.out.println("Number of characters: " + sentence(c));
    }
}