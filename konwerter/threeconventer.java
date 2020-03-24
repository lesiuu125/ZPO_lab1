public class threeconventer implements Converter {

    @Override
    public void convert(int liczba)
    {
        System.out.println(Integer.toString(liczba,3));

    }

}