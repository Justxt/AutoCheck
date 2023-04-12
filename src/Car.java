public class Car {

    String color;
    int doors;
    String plates;
    String model;
    int tires;

    Machine machine;
    Owner owner;


    double speed() {
        double speedm=0;
        speedm=machine.force()*tires;
        return speedm;
    }

    public Car(String color, int doors, String plates, String model, int tires) {
        this.color = color;
        this.doors = doors;
        this.plates = plates;
        this.model = model;
        this.tires = tires;
    }
}
