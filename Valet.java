public class Valet implements HotelService {
    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void parkVehicle(String plateNumber) {
        System.out.println("Valet: Parking vehicle " + plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Picking up vehicle " + plateNumber);
    }
}