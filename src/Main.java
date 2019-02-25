import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String carMake;
        String carModel;
        int carYear;


        System.out.println();

        Vehicle vehicle = new Vehicle();

        vehicle.setCarMake("Acura");
        vehicle.setCarModel("RSX");
        vehicle.setCarYear(2002);

        System.out.println("My Car Make: "+vehicle.getCarMake());
        System.out.println("My Car Model: "+vehicle.getCarModel());
        System.out.println("My Car Year: "+vehicle.getCarYear());

        Map<Integer, String> hashMap = new HashMap<>();
//        Map<Integer, String> hashMap1 = new HashMap<>();

        hashMap.put(1, "Acura");
        hashMap.put(2, "Honda");
        hashMap.put(3, "Nissan");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println(key1+" : "+value1);
        }

        System.out.println("Enter Numerical Value for Car: ");
        int num = scanner.nextInt();
        hashMap.get(num);

        System.out.println("You Chose: "+hashMap.get(num));

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
