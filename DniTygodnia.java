/*
Utwórz podprogramy, które zwracają pełną nazwę dnia tygodnia na podstawie podanego 
do podprogramu skrótu nazwy (pn,wt,sr,cz,pt,sb,nd) lub numeru dnia tygodnia (1 do 7). 
Wykorzystaj mechanizm przeciążania. 
Wyświetl pełną nazwę dnia tygodnia dla pt oraz 4.
*/

public class DniTygodnia {

    static void dzienTygodnia(int a)
    {
		String[] tab= {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela"};
		System.out.println(tab[a - 1]);
    }
    
    static void dzienTygodnia(String dni)
    {    
        switch(dni)
        {
            case "pn":
                System.out.print("poniedzialek");
            break;

            case "wt":
                System.out.print("wtorek");
            break;

            case "sr":
                System.out.print("sroda");
            break;

            case "czw":
                System.out.print("czwartek");
            break;

            case "pt":
                System.out.print("piatek");
            break;

            case "sb":
            System.out.print("sobota");
            break;

            case "nd":
            System.out.print("niedziela");
            break;
	    }
	
    }
    
    public static void main(String[]args)
    {
		dzienTygodnia(4);
		dzienTygodnia("pt");
	}
}