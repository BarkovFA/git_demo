package task9;

public abstract class BaseConverter implements ConvertTemp {
    protected String lastDegrees;

    @Override
    public String getLastOperation() {
        return lastDegrees;
    }

    protected String getSymbol() {
        return "C";
    }

    protected abstract String getTempSymb();

    protected void setLastDegrees(double cels, double foreng) {
        this.lastDegrees = String.format("%.2fs -> %.2f%s", cels, getSymbol(), foreng, getTempSymb());
    }
}


