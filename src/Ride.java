public class Ride {

    int id;
    String source;
    String destination;
    int seats;
    double fare;

    public Ride(int id,String source, String destination, int seats, double fare) {
        this.id = id;
        this.destination = destination;
        this.source = source;
        this.seats = seats;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", seats=" + seats +
                ", fare=" + fare +
                '}';
    }

}
