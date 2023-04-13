public class Machine {

    private double displacement;

    private String serie;

    private int valves;
    private String fuel;

    public Machine() {

    }


    public Machine(double displacement, int valves, String fuel, String serie) {
        this.displacement = displacement;
        this.valves = valves;
        this.fuel = fuel;
        this.serie = serie;
    }

    double force(){
        double forcem=0;
        if(fuel.equals("gasoline")){
            forcem=displacement*2;
        }else if (fuel.equals("diesel")){
            forcem=displacement*4;
        }
        return forcem;
    }


    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Machine(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}


