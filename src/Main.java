// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Owner owner = new Owner("Justin", "000000000");
        Car car = new Car("Red", 4, "PXF-5547", "Rio", 4);
        Machine machine = new Machine(2000, 4, "Gasoline");

        System.out.println("This car from" + owner + " is " + car.color + ".");

    }
}