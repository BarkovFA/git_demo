package task9;

public class ConvertKelvin extends BaseConverter{

    @Override
    public double getConvert(double degrees)  {
        double kelvin = degrees + 273.1;
        setLastDegrees(degrees, kelvin);
        return kelvin;
    }

    @Override
    protected String getSymbol() {
        return "K";
    }
}
