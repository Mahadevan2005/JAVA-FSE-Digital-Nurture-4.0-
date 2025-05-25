public class CarClassObject {
    String make;
    String model;
    int year;
    CarClassObject(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails()
    {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
    public static void main(String[] args)
    {
        CarClassObject c = new CarClassObject("BMW", "Street Rider", 2025);
        c.displayDetails();
    }
}
