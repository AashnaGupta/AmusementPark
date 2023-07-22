/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public class Rollercoaster extends Ride {
    private boolean simulated;

    public Rollercoaster(String name, String color, int minHeight, int maxRiders, boolean simulated) {
        super(name, color, minHeight, maxRiders);
        this.simulated = simulated;
    }
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Rollercoaster))
            return false;
        Rollercoaster temp = (Rollercoaster) o;
        return temp.getName().equals(getName()) && temp.getColor().equals(getColor())
                && temp.getMinHeight() == getMinHeight() && temp.getMaxRiders() == getMaxRiders()
                && temp.isSimulated() == simulated;
    }

    public boolean isSimulated() {
        return simulated;
    }

    public void setSimulated(boolean simulated) {
        this.simulated = simulated;
    }

    public String toString() {
        String rv = super.toString();
        rv = rv + "\nSimulated: " + simulated;
        return rv;
    }
}