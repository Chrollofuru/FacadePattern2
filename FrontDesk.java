public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void parkVehicle(String plateNumber) {
        valet.parkVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }

    public void checkIn(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("=== Guest check-in (Room " + roomNumber + ") ===");
        valet.parkVehicle(plateNumber);
        cart.requestCart(numberOfCarts);
    }

    public void checkOut(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("=== Guest check-out (Room " + roomNumber + ") ===");
        cart.requestCart(numberOfCarts);
        houseKeeping.cleanRoom(roomNumber);
        valet.pickUpVehicle(plateNumber);
    }
}