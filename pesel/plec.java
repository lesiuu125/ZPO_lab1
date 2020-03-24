public class plec implements analiza {
    public void analizuj(String pesel)
    {
        System.out.println("\nPlec: ");
        if( pesel.charAt(9) == '1' || pesel.charAt(9) == '3' || pesel.charAt(9) == '5' || pesel.charAt(9) == '7' || pesel.charAt(9) == '9') // porównanie ze znakiem
        {
            System.out.println("Mezczyzna");
        }
        else
        {
            System.out.println("Kobieta");
        }
    }
}
