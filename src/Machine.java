public class Machine {

    int displacement;
    int valves;
    String fuel;

    double force() {
        double forcem=0;
        if (fuel.equals("Gasoline")) {
            forcem=displacement*valves;
        }
        return forcem;
    }

    public Machine(int displacement, int valves, String fuel) {
        this.displacement = displacement;
        this.valves = valves;
        this.fuel = fuel;
    }

}
