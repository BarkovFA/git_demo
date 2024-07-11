package task9;

public class ConvertForengate extends BaseConverter {

    @Override
    public double getConvert(double degrees)  {
        double forengate = (degrees * 1.8) + 32;
        setLastDegrees(degrees, forengate);
        return forengate;
    }

    @Override
    protected String getSymbol() {
        return "F";
    }
}
