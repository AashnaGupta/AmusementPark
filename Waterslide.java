/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public class Waterslide extends Ride {
    private double splashDepth;

    public Waterslide(String name, String color, int minHeight, int maxRiders, double splashDepth) {
        super(name, color, minHeight, maxRiders);
        this.splashDepth = splashDepth;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Waterslide))
            return false;
        Waterslide temp = (Waterslide) o;
        return temp.getName().equals(getName()) && temp.getColor().equals(getColor())
                && temp.getMinHeight() == getMinHeight() && temp.getMaxRiders() == getMaxRiders()
                && temp.getSplashDepth() == splashDepth;
    }

    public double getSplashDepth() {
        return splashDepth;
    }

    public void setSplashDepth(double splashDepth) {
        this.splashDepth = splashDepth;
    }

    public String toString() {
        String rv = super.toString();
        rv = rv + "\nSplashDepth: " + splashDepth + " feet";
        return rv;
    }
}