import java.util.ArrayList;
/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public class WaterPark implements Park {
    private String name;
    private double admissionCost;
    private double land;
    private ArrayList<Ride> rides;
    private boolean indoor;
    private boolean outdoor;
    private boolean lazyRiver;
    private boolean wavePool;
    private boolean[] seasons;


    public WaterPark(String name, double admissionCost, double land, ArrayList<Ride> rides,
                     boolean indoor, boolean outdoor, boolean lazyRiver, boolean wavePool, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.lazyRiver = lazyRiver;
        this.wavePool = wavePool;
        this.seasons = seasons;
    }

    public boolean isLazyRiver() {
        return lazyRiver;
    }

    public boolean isWavePool() {
        return wavePool;
    }

    public void setLazyRiver(boolean lazyRiver) {
        this.lazyRiver = lazyRiver;
    }

    public void setWavePool(boolean wavePool) {
        this.wavePool = wavePool;
    }

    @Override
    public void addRide(Ride ride) throws WrongRideException {

        if (ride instanceof Waterslide)
            rides.add(ride);
        else
            throw new WrongRideException("A waterpark can only have waterslide rides!");
    }

    @Override
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

    @Override
    public double getAdmissionCost() {
        return admissionCost;
    }

    @Override
    public double getLand() {
        return land;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Ride> getRides() {
        return rides;
    }

    @Override
    public boolean[] getSeasons() {
        return seasons;
    }

    @Override
    public boolean isIndoor() {
        return indoor;
    }

    @Override
    public boolean isOutdoor() {
        return outdoor;
    }

    @Override
    public void removeRide(Ride ride) {
        rides.remove(ride);
    }

    @Override
    public void setAdmissionCost(double admissionCost) {
        this.admissionCost = admissionCost;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSeasons(boolean[] seasons) {
        this.seasons = seasons;
    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight,
                           int newMaxRiders, double newSplashDepth) {

        int i = rides.indexOf(ride);
        rides.get(i).setName(newName);
        rides.get(i).setColor(newColor);
        rides.get(i).setMinHeight(newMinHeight);
        rides.get(i).setMaxRiders(newMaxRiders);
        if (rides.get(i) instanceof Waterslide)
            ((Waterslide) rides.get(i)).setSplashDepth(newSplashDepth);

    }
    @Override
    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        outdoor = false;
        lazyRiver = false;
        wavePool = false;
    }
}