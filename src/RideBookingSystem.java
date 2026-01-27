import java.util.ArrayList;
import java.util.List;
public class RideBookingSystem {
    //    public signup(){
//
//    }
//    public login(){
//
//    }
    public List<Ride>  rideList = new ArrayList<>();
    public void createRide(int id, String Source, String destination,int seats,double fare,
                           ){
        Ride ride = new Ride( id,Source, destination, seats, fare);
        rideList.add(ride);
    }

    public List<Ride> showAllRide() {
        return rideList;
    }

    public List<Ride> searchRide(String source,String destination , int seats){
        List<Ride> availableride = new ArrayList<>();
        for(Ride ride: rideList){
            if(ride.source.equals(source) && ride.destination.equals(destination))
            {
                availableride.add(ride);
            }
        }
        return availableride;
    }


}