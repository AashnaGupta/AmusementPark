import java.util.ArrayList;
/**
 * @author  Aashna Gupta
 * @version 1.0
 */
public interface Park {
    void addRide(Ride ride) throws WrongRideException;
    void close();

    void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException;

    double getAdmissionCost();
    double getLand();

    String getName();

    ArrayList<Ride> getRides();

    boolean[] getSeasons();

    boolean isIndoor();

    boolean isOutdoor();

    void removeRide(Ride ride);

    void setAdmissionCost(double admissionCost);

    void setName(String name);

    void setSeasons(boolean[] seasons);

}