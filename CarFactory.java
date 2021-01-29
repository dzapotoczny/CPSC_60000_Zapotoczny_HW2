public class CarFactory {
    public CarType createCar(String type){
        CarType carType = null;

        if (type.equals("Budget")) {
            carType = new Budget();
        } else if (type.equals("HighEnd")) {
            carType = new HighEnd();
        } else if (type.equals("Luxury")) {
            carType = new Luxury();
        } else if (type.equals("MidRange")) {
            carType = new MidRange();
        }
        return carType;
    }
}
