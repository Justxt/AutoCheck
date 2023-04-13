public class Car {

    private String plates;
    private String model;
    private String color;
    private int doors;
    private int tires;
    private Machine machine;
    private Owner owner;

    public Car() {

    }

    double speed(int a){
        double speedm=0;
        switch (a){
            case 2:
                speedm= machine.force()*a*2;
                break;
            case 4:
                speedm= machine.force()*a*3;
                break;
            case 6:
                speedm= machine.force()*a*5;
                break;
        }
        return speedm;
    }


    public Car(String color, int doors, String plates, String model, int tires) {
        this.color = color;
        this.doors = doors;
        this.plates = plates;
        this.model = model;
        this.tires = tires;
    }


    public Car(Machine machine, Owner owner) {
        this.machine = machine;
        this.owner = owner;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine() {
        this.machine = machine;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    public void printA() {
        System.out.println("El color del auto es " + color);
        System.out.println("El numero de puertas del auto es " + model);
        System.out.println("El modelo del auto es " + model);
        System.out.println("El numero de llanta del auto es "+ tires);
        System.out.println("El cilindraje del auto es " + machine.getDisplacement());
        System.out.println("EL numero de valvulas es " + machine.getValves());
        System.out.println("El combustible del carro es " + machine.getFuel());
        System.out.println("El nombre del dueño es " + owner.getName());
        System.out.println("El Numero de cedula del dueño es " + owner.getCedula());

    }
}

