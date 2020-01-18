package PostLabExercise_6_a;
abstract class Shape {
    protected int location;
    public Shape(int location){
        this.location=location;
    }
    public abstract void display();
}