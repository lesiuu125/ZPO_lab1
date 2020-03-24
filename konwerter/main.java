import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int liczba = 0b1101_1000;
        decconverter dec = new decconverter();
        hexconverter hex = new hexconverter();
        threeconventer three = new threeconventer();
        Scanner scan = new Scanner(System.in);
       String odp="lol";
        while(!odp.equals("dziesiec") && !odp.equals("szesnascie") && odp!="trzy"){
            System.out.println("Prosze o wpisanie nazwy systemu (dziesiec, szesnascie, trzy): ");
            odp = scan.nextLine();
            if (odp.equals("dziesiec"))
            {
                dec.convert(liczba);
            } else if (odp.equals("szesnascie"))
            {
                hex.convert(liczba);
            } else if (odp.equals("trzy"))
            {
                three.convert(liczba);

            } else {
                System.out.println("Blad!");

            }
        }


    }
}