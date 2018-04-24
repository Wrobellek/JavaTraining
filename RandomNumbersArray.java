/*
Create a subroutine returning an array of ten random natural numbers between <5; 8>. 
Display elements of the array.
*/

import java.util.Random;

public class RandomNumbersArray
{
    static void randomValues()
    {
        Random r = new Random();

		int[] tab = new int[10];
        
        for(int i = 0; i < tab.length; i++)
        {
			tab[i] = r.nextInt(4) + 5;
        }
        
        for (int arrayValues : tab)
        {
            System.out.println(arrayValues);
        }
		
	}

    public static void main(String[] args)
    {
        randomValues();
    }
}