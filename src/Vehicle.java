class Vehicle {
    private String carMake;
    private String carModel;
    private int carYear;

//    public Vehicle(String carMake, String carModel, int carYear) {
//        this.carMake = carMake;
//        this.carModel = carModel;
//        this.carYear = carYear;
//    }

//  Setters for Vehicle
    public void setCarMake(String carMake) { this.carMake = carMake; }
    public void setCarModel(String carModel) { this.carModel = carModel; }
    public void setCarYear(int carYear) { this.carYear = carYear; }


//  Getters for Vehicle
    public String getCarMake() { return carMake; }
    public String getCarModel() { return carModel; }
    public int getCarYear() { return carYear; }

//    Change
    public void changeCarMake(String newCarMake) { carMake = newCarMake; }
    public void changeCarModel(String newCarModel) { carModel = newCarModel; }
    public void changeCarYear(int newCarYear) { carYear = newCarYear; }
}