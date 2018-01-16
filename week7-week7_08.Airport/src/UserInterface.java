import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan = new Scanner(System.in);
    private List<Plane> planes = new ArrayList<Plane>();
    private List<Flight> flights = new ArrayList<Flight>();


    // Methods
    public void start() {
        // Airport Panel
        printHeader();
        printMenu();
        // Menu selection
        commandLine(getString(scan));

        // Flight Service Panel
        printHeaderFlightService();
        printMenuFS();
        flightService(getString(scan));



    }

    private void printMenuFS() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print(">");
    }

    private void flightService(String s) {

        while (true) {

            if (s.equalsIgnoreCase("x")) {
                break;

            } else if (s.equalsIgnoreCase("1")) {
                printPlanes();

            } else if (s.equalsIgnoreCase("2")) {
                printFlights();

            } else if (s.equalsIgnoreCase("3")) {
                printPlaneInfo();
            }
            printMenuFS();
            s = getString(scan);
        }

    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String plane = getString(scan);

        for (Plane p : planes) {
            if (p.getPlaneID().contains(plane)) {
                System.out.println(p);
            }
        }
        System.out.println();
    }

    private void printFlights() {
        for (Flight f : flights) {
            System.out.println(f);
        }
        System.out.println();
    }

    private void printPlanes() {
        for (Plane p : planes) {
            System.out.println(p.toString());
        }
    }

    private void printHeaderFlightService() {
        System.out.println("\nFlight service");
        System.out.println("------------\n");
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String planeID = getString(scan);
        System.out.print("Give plane capacity: ");
        int planeCapacity = getInt(scan);
        // Add check if plane already exists "if -> overridden equals"
        planes.add(new Plane(planeID, planeCapacity));

    }

    private void addFlight() {

        System.out.print("Give plane ID: ");
        String planeID = getString(scan);
        System.out.print("Give departure airport code: ");
        String departure = getString(scan);
        System.out.print("Give destination airport code: ");
        String arrival = getString(scan);

        int capacity = 0;
        for (Plane plane : planes) {
            if (planeID.equals(plane.getPlaneID())) {
                capacity = plane.getPlaneCapacity();
            }
        }
        flights.add(new Flight(planeID, capacity, departure, arrival));
    }

    private void printHeader() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
    }

    private void printMenu() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print(">");
    }

    private String getString(Scanner scan) {
        return scan.nextLine();
    }

    private int getInt(Scanner scan) {
        return Integer.parseInt(scan.nextLine());
    }

    private void commandLine(String s) {

        while (true) {

            if (s.equalsIgnoreCase("x")) {
                break;

            } else if (s.equalsIgnoreCase("1")) {
                addPlane();

            } else if (s.equalsIgnoreCase("2")) {
                addFlight();
            }
            printMenu();
            s = getString(scan);
        }
    }











}