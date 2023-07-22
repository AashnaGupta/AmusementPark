/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public class Ride {
    private String name;
    private String color;
    private int minHeight;
    private int maxRiders;


    public Ride() {
        name = "";
        color = "";
        minHeight = 0;
        maxRiders = 0;
    }

    public Ride(String name, String color, int minHeight, int maxRiders) {
        this.color = color;
        this.maxRiders = maxRiders;
        this.minHeight = minHeight;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Ride))
            return false;
        Ride temp = (Ride) o;
        return temp.getName().equals(name) && temp.getColor().equals(color)
                && temp.getMinHeight() == minHeight && temp.getMaxRiders() == maxRiders;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String s1 = "Name: " + name + "\n";
        String s2 = "Color: " + color + "\n";
        String s3 = "MinHeight: " + minHeight + " inches" + "\n";
        String s4 = "MaxRiders: " + maxRiders;
        return (s1 + s2 + s3 + s4);
    }
}