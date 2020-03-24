import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pesel="12345678999";
       while((pesel.charAt(2)=='9' || pesel.charAt(2)=='3' || pesel.charAt(2)=='5' || pesel.charAt(2)=='7')&&(pesel.charAt(3)=='4' || pesel.charAt(3)=='5'|| pesel.charAt(3)=='6' || pesel.charAt(3)=='7' || pesel.charAt(3)=='8' || pesel.charAt(3)=='9') || pesel.length()!=11 || (pesel.charAt(4)=='4' || pesel.charAt(4)=='5' || pesel.charAt(4)=='6' || pesel.charAt(4)=='7' || pesel.charAt(4)=='8' || pesel.charAt(4)=='9') || ((pesel.charAt(4)=='3')&&(pesel.charAt(5)=='2' || pesel.charAt(5)=='3' || pesel.charAt(5)=='4' || pesel.charAt(5)=='5' || pesel.charAt(5)=='6' || pesel.charAt(5)=='7' || pesel.charAt(5)=='8' || pesel.charAt(5)=='9')) || ((pesel.charAt(2)=='0' || pesel.charAt(2)=='2' || pesel.charAt(2)=='4' || pesel.charAt(2)=='6' || pesel.charAt(2)=='8')&&(pesel.charAt(3)=='0')))
        {
            System.out.println("Podaj PESEL: ");
            pesel = scan.nextLine();
            if(pesel.length()!=11)
            {
                System.out.println("PESEL powinien zawierac 11 cyfr! ");
            }
            else if((pesel.charAt(4)=='4' || pesel.charAt(4)=='5' || pesel.charAt(4)=='6' || pesel.charAt(4)=='7' || pesel.charAt(4)=='8' || pesel.charAt(4)=='9') || ((pesel.charAt(4)=='3')&&(pesel.charAt(5)=='2' || pesel.charAt(5)=='3' || pesel.charAt(5)=='4' || pesel.charAt(5)=='5' || pesel.charAt(5)=='6' || pesel.charAt(5)=='7' || pesel.charAt(5)=='8' || pesel.charAt(5)=='9')))
            {
                System.out.println("BLEDNY dzien urodzin! ");
            }
            else if((pesel.charAt(2)=='9' || pesel.charAt(2)=='3' || pesel.charAt(2)=='5' || pesel.charAt(2)=='7')&&(pesel.charAt(3)=='4' || pesel.charAt(3)=='5'|| pesel.charAt(3)=='6' || pesel.charAt(3)=='7' || pesel.charAt(3)=='8' || pesel.charAt(3)=='9') || ((pesel.charAt(2)=='0' || pesel.charAt(2)=='2' || pesel.charAt(2)=='4' || pesel.charAt(2)=='6' || pesel.charAt(2)=='8')&&(pesel.charAt(3)=='0')))
            {
                System.out.println("Błąd z 3-4 cyfra PESELu! ");
            }


        }

        plec aasa = new plec();
        data lol = new data();
        aasa.analizuj(pesel);
        lol.analizuj(pesel);
    }
}
