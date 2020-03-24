import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liczba=1000;
        System.out.println("Podaj liczbe: ");
        while(liczba>999 || liczba<-999){
            String text = scan.nextLine();
            //liczba = scan.nextInt();

            try {
                //liczba = Double.parseDouble(text);
                liczba = Integer.parseInt(text);
            }
            catch(NumberFormatException e){
                System.out.println("Nie podano liczby");
            }
            if(liczba>999 || liczba<-999)
            {
                System.out.println("Musi to byc liczba trzycyfowa! Podaj jeszcze raz: ");
            }
        }

        converter had = new converter();
        String wyraz = Integer.toString(liczba);
        had.convert(wyraz);
    }
}