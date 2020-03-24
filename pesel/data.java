public class data implements analiza {
    public void analizuj(String pesel)
    {
        System.out.println("\nDATA URODZENIA: ");
        if(pesel.charAt(2)=='2'  || pesel.charAt(2)=='3')
        {
            if(pesel.charAt(2)=='2')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"0"+"" +pesel.charAt(3)+"-"+"20" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
            else if(pesel.charAt(2)=='3')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"1"+"" +pesel.charAt(3)+"-"+"20" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
        }
        else if(pesel.charAt(2)=='8'  || pesel.charAt(2)=='9')
        {
            if(pesel.charAt(2)=='8')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"0"+"" +pesel.charAt(3)+"-"+"18" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
            else if(pesel.charAt(2)=='9')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"1"+"" +pesel.charAt(3)+"-"+"18" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
        }
        else if(pesel.charAt(2)=='4'  || pesel.charAt(2)=='5')
        {
            if(pesel.charAt(2)=='4')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"0"+"" +pesel.charAt(3)+"-"+"21" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
            else if(pesel.charAt(2)=='5')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"1"+"" +pesel.charAt(3)+"-"+"21" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
        }
        else if(pesel.charAt(2)=='6'  || pesel.charAt(2)=='7')
        {
            if(pesel.charAt(2)=='6')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"0"+"" +pesel.charAt(3)+"-"+"22" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
            else if(pesel.charAt(2)=='7')
            {
                System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+"1"+"" +pesel.charAt(3)+"-"+"22" +pesel.charAt(0)+"" +pesel.charAt(1));
            }
        }
        else
        {
            System.out.println("" +pesel.charAt(4)+"" +pesel.charAt(5)+"-"+""+pesel.charAt(2)+""+pesel.charAt(3)+"-"+"19" +pesel.charAt(0)+"" +pesel.charAt(1));
        }

    }
}
