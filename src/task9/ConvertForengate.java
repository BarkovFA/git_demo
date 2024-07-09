package task9;

public class ConvertForengate extends BaseConverter{

    public double getConvert(double degrees)  {
        double forengate = (degrees * 1.8) + 32;
        setLastDegrees(degrees, forengate, "F");
        return forengate;
    }


}
