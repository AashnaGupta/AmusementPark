import java.util.ArrayList;
/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public class AmusementPark implements Park {
    private double admissionCost;
    private boolean arcade;
    private boolean bowling;
    private boolean indoor;
    private double land;
    private String name;
    private boolean outdoor;
    private ArrayList<Ride> rides;
    private boolean[] seasons;

    public AmusementPark(String name, double admissionCost, double land, ArrayList<Ride> rides,
                         boolean indoor, boolean outdoor, boolean arcade, boolean bowling, boolean[] seasons) {
        this.admissionCost = admissionCost;
        this.arcade = arcade;
        this.bowling = bowling;
        this.indoor = indoor;
        this.land = land;
        this.name = name;
        this.outdoor = outdoor;
        this.rides = rides;
        this.seasons = seasons;
    }

    public boolean isArcade() {
        return arcade;
    }

    public void setArcade(boolean arcade) {
        this.arcade = arcade;
    }

    public boolean isBowling() {
        return bowling;
    }

    public void setBowling(boolean bowling) {
        this.bowling = bowling;
    }

    public double getAdmissionCost() {
        return admissionCost;
    }

    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLand() {
        return land;
    }

    public void addRide(Ride ride) throws WrongRideException {

        if (ride instanceof Rollercoaster)
            rides.add(ride);
        else
            throw new WrongRideException("An amusement park can only have rollercoaster rides!");
    }

    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    public boolean[] getSeasons() {
        return seasons;
    }

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor,
                        boolean addedOutdoor) throws SpaceFullException {
        if (land + addedLand > maxLand)
            throw new SpaceFullException("There is no more land to use for this park!");

        else {
            land = land + addedLand;
            if (addedIndoor)
                indoor = true;
            if (addedOutdoor)
                outdoor = true;
        }

    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight,
                           int newMaxRiders, boolean newSimulated) {
        int i = rides.indexOf(ride);
        rides.get(i).setName(newName);
        rides.get(i).setColor(newColor);
        rides.get(i).setMinHeight(newMinHeight);
        rides.get(i).setMaxRiders(newMaxRiders);
        if (rides.get(i) instanceof Rollercoaster)
            ((Rollercoaster) rides.get(i)).setSimulated(newSimulated);
    }

    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        arcade = false;
        bowling = false;
    }
}