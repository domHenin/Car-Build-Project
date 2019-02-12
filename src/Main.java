import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carMake;
        String carModel;
        int carYear;

        ArrayList<String> carMakes = new ArrayList<>();

        carMakes.add("Acura");
        carMakes.add("Honda");
        carMakes.add("Nissan");

        for (int i=0; i<carMakes.size(); i++){
            System.out.println("Car Make Names: "+carMakes.get(i));
        }

        System.out.println();

        Vehicle vehicle = new Vehicle();

        vehicle.setCarMake("Acura");
        vehicle.setCarModel("RSX");
        vehicle.setCarYear(2002);

        System.out.println("My Car Make: "+vehicle.getCarMake());
        System.out.println("My Car Model: "+vehicle.getCarModel());
        System.out.println("My Car Year: "+vehicle.getCarYear());

        Vehicle vehicle1 = new Vehicle();

        System.out.println("\nYour turn!!");

        System.out.println("Enter Car Make: ");
        carMake = input.next();
        vehicle1.changeCarMake(carMake);

        System.out.println("Enter Car Model: ");
        carModel=input.next();
        vehicle1.changeCarModel(carModel);

        System.out.println("Enter Car Year: ");
        carYear=input.nextInt();
        vehicle1.changeCarYear(carYear);

        System.out.println("User Car Make: "+vehicle1.getCarMake());
        System.out.println("User Car Model: "+vehicle1.getCarModel());
        System.out.println("User Car Year: "+vehicle1.getCarYear());


    }
}
