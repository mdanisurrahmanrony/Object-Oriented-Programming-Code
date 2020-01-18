package PostLabExercise_6_b;
abstract class Vehicle {
    protected String model;
    public Vehicle(String model){
        this.model=model;
    }
    public abstract void display();
}