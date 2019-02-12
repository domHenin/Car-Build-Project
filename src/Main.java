import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carMake;
        String carModel;
        int carYear;

        Vehicle vehicle = new Vehicle();

        vehicle.setCarMake("Acura");
        vehicle.setCarModel("RSX");
        vehicle.setCarYear(2002);

        System.out.println("My Car Make: "+vehicle.getCarMake());
        System.out.println("My Car Model: "+vehicle.getCarModel());
        System.out.println("My Car Year: "+vehicle.getCarYear());

    }
}
