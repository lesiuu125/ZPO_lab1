public class hexconverter implements Converter {
    @Override
    public void convert(int liczba)
    {
        String hex = Integer.toHexString(liczba);
        System.out.println("Hexdecimal: "+hex);
    }
}