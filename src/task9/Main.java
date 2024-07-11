package task9;

public class Main {
    public static void main(String[] args) {
        ConvertTemp convertTemp = new ConvertForengate();
        ConvertTemp convertTemp1 = new ConvertKelvin();

        double celsium = 10.2;
        double fareng = convertTemp.getConvert(celsium);
        double kelvin = convertTemp1.getConvert(celsium);
        System.out.println(convertTemp.getLastOperation());

    }


}

