public class converter {
    public void convert(String wyraz)
    {
        for(int i=0; i<wyraz.length(); i++) {
            if (wyraz.charAt(i) == '-') {
                System.out.println("minus");
            }
            else if(wyraz.charAt(i) == '1')
            {
                System.out.println("jeden");
            }
            else if(wyraz.charAt(i) == '2')
            {
                System.out.println("dwa");
            }
            else if(wyraz.charAt(i) == '3')
            {
                System.out.println("trzy");
            }
            else if(wyraz.charAt(i) == '4')
            {
                System.out.println("cztery");
            }
            else if(wyraz.charAt(i) == '5')
            {
                System.out.println("pięć");
            }
            else if(wyraz.charAt(i) == '6')
            {
                System.out.println("sześć");
            }
            else if(wyraz.charAt(i) == '7')
            {
                System.out.println("siedem");
            }
            else if(wyraz.charAt(i) == '8')
            {
                System.out.println("osiem");
            }
            else if(wyraz.charAt(i) == '9')
            {
                System.out.println("dziewięć");
            }
            else if(wyraz.charAt(i) == '0')
            {
                System.out.println("zero");
            }
        }
    }
}
