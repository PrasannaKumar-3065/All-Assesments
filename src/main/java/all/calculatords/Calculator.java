package all.calculatords;

import java.util.logging.Logger;

public abstract class Calculator {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private double value;

    protected abstract void add(double value);

    protected abstract void sub(double value);

    protected abstract void mul(double value);

    protected abstract void div(double value);

    protected abstract void rem(double value);

    public double getValue() {
        return value;
    }

    public void setValue(double val) {
        value = val;
    }
}
