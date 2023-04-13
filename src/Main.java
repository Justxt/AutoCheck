import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Owner owner = new Owner("Justin", "000000000");
        Car car = new Car("Red", 4, "PXF-5547", "Rio", 4);
        Machine machine = new Machine(2.0, 4, "Gasoline", "123423");

        Owner owner1 = new Owner("Juan", "1111111111");
        Car car1 = new Car("Blue", 4, "PGF-8642", "Cautiva", 4);
        Machine machine1 = new Machine(2.5, 4, "Gasoline", "2354345");

        Owner owner2 = new Owner("Pedro", "2222222222");
        Car car2 = new Car("White", 4, "PFF-4582", "Rio", 4);
        Machine machine2 = new Machine(2.0, 4, "Gasoline", "25436");

    //////////////////////////////////////////////////////////////////////////////////////////////////////

        Owner owner3 = new Owner("Paco", "3333333333");
        Machine machine3 = new Machine("12315");
        Car car3 =  new Car(machine3, owner3);




        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el color del vehiculo");
        String color = sc.next();
        System.out.println("Ingrese el n de puertas del vehiculo");
        int doors = Integer.parseInt(sc.next());
        System.out.println("Ingrese el modelo del vehiculo");
        String model = sc.next();
        System.out.println("Ingrese el n de llantas del vehiculo");
        int tires = Integer.parseInt(sc.next());
        System.out.println("Ingrese el tipo de gasolina del vehiculo");
        String fuel = sc.next();
        System.out.println("Ingrese el cilindraje del vehiculo");
        double displacement = Double.parseDouble(sc.next());
        System.out.println("Ingrese el n de valvulas del vehiculo");
        int valves = Integer.parseInt(sc.next());

        car3.setColor(color);
        car3.setDoors(doors);
        car3.setModel(model);
        car3.setTires(tires);
        car3.getMachine().setDisplacement(displacement);
        car3.getMachine().setValves(valves);
        car3.getMachine().setFuel(fuel);
        car.printA();



    }
}