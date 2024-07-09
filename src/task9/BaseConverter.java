package task9;

public abstract class BaseConverter implements ConvertTemp {
    protected String lastDegrees;

    protected void setLastDegrees(double cels, double foreng, String init) {
        lastDegrees = String.format("%.2fC -> %.2f%s", cels, foreng, init);
    }

}


