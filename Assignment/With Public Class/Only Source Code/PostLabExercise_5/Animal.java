package PostLabExercise_5;
abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void move();
}