//Create a subroutine that returns the current date. Then display this date.
import java.util.*;
import java.text.*;

public class CurrentDate
{
    static void calendar()
    {
        Date currentDate = new Date();
        
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        
        System.out.println(sdf.format(currentDate));

	}
    
    public static void main(String[] args)
    {
	    calendar();
    }
}