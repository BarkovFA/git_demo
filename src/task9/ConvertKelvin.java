package task9;

public class ConvertKelvin extends BaseConverter{

    public double getConvert(double degrees)  {
        double kelvin = degrees + 273.1;
        setLastDegrees(degrees, kelvin, "C");
        return kelvin;
    }
}
