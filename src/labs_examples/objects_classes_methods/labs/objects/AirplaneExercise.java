package labs_examples.objects_classes_methods.labs.objects;

class AirplaneExercise {

    public static void main(String[] args) {

        Passengers passengers = new Passengers(4,3,113);
        FlightPath flightPath = new FlightPath("SFO", "JFK", "AS 1022",
                08.30,17.20, 6.50,"2","D3","8","5");
        FlightCrew flightCrew = new FlightCrew(true,true,6);


       Airplane myAirplane = new Airplane(8675,6615,"Alaska Airlines",
               passengers, flightPath, flightCrew);


        System.out.println(myAirplane.toString());

    }


}

class Passengers {

    int firstClassSeatsFilled;
    int businessClassSeatsFilled;
    int economyClassSeatsFilled;

    public Passengers(int firstClassSeatsFilled, int businessClassSeatsFilled, int economyClassSeatsFilled) {
        this.firstClassSeatsFilled = firstClassSeatsFilled;
        this.businessClassSeatsFilled = businessClassSeatsFilled;
        this.economyClassSeatsFilled = economyClassSeatsFilled;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                " firstClassSeatsFilled = " + firstClassSeatsFilled +
                ", businessClassSeatsFilled = " + businessClassSeatsFilled +
                ", economyClassSeatsFilled = " + economyClassSeatsFilled +
                '}';
    }
}

class FlightPath {

    String originAirport;
    String destinationAirport;
    String flightNumber;
    double takeoffTimeAtOrigin;
    double arrivalTimeAtDestination;
    double lengthOfFlight;
    String departureTerminal;
    String departureGate;
    String arrivalTerminal;
    String arrivalGate;


    public FlightPath(String originAirport, String destinationAirport, String flightNumber, double takeoffTimeAtOrigin,
                      double arrivalTimeAtDestination, double lengthOfFlight, String departureTerminal,
                      String departureGate, String arrivalTerminal, String arrivalGate) {
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.flightNumber = flightNumber;
        this.takeoffTimeAtOrigin = takeoffTimeAtOrigin;
        this.arrivalTimeAtDestination = arrivalTimeAtDestination;
        this.lengthOfFlight = lengthOfFlight;
        this.departureTerminal = departureTerminal;
        this.departureGate = departureGate;
        this.arrivalTerminal = arrivalTerminal;
        this.arrivalGate = arrivalGate;
    }

    @Override
    public String toString() {
        return "FlightPath{" +
                " originAirport = '" + originAirport + '\'' +
                ", destinationAirport = '" + destinationAirport + '\'' +
                ", flightNumber = '" + flightNumber + '\'' +
                ", takeoffTimeAtOrigin = " + takeoffTimeAtOrigin +
                ", arrivalTimeAtDestination = " + arrivalTimeAtDestination +
                ", lengthOfFlight = " + lengthOfFlight +
                ", departureTerminal = '" + departureTerminal + '\'' +
                ", departureGate = '" + departureGate + '\'' +
                ", arrivalTerminal = '" + arrivalTerminal + '\'' +
                ", arrivalGate = '" + arrivalGate + '\'' +
                '}';
    }
}

class FlightCrew {

    boolean pilot;
    boolean coPilot;
    int cabinCrew;

    public FlightCrew(boolean pilot, boolean coPilot, int cabinCrew) {
        this.pilot = pilot;
        this.coPilot = coPilot;
        this.cabinCrew = cabinCrew;
    }

    @Override
    public String toString() {
        return "FlightCrew{" +
                " pilot = " + pilot +
                ", coPilot = " + coPilot +
                ", cabinCrew = " + cabinCrew +
                '}';
    }
}

class Airplane {

        double fuelCapacity;
        double currentFuelLevel;
        String airline;
        Passengers passengers;
        FlightPath flightPath;
        FlightCrew flightCrew;

    public Airplane(double fuelCapacity, double currentFuelLevel, String airline, Passengers passengers,
                    FlightPath flightPath, FlightCrew flightCrew) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.airline = airline;
        this.passengers = passengers;
        this.flightPath = flightPath;
        this.flightCrew = flightCrew;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "\nfuelCapacity= " + fuelCapacity +
                ", \ncurrentFuelLevel = " + currentFuelLevel +
                ", \nairline = '" + airline + '\'' +
                ", \npassengers = " + passengers.toString() +
                ", \nflightPath = " + flightPath.toString() +
                ", \nflightCrew = " + flightCrew.toString() +
                '}';
    }
}