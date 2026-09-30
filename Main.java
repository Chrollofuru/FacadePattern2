public class Main {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.checkIn("ABC-1234", 305, 2);

        System.out.println();

        frontDesk.checkOut("ABC-1234", 305, 2);
    }
}
