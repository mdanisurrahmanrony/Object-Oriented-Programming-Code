package PostLabExercise_5;
class Dog extends Animal {
    private String color;
    public Dog(String name, String color) {
        super(name);
        this.color=color;
    }
    public void move(){
        System.out.println("Dog moves fastly");
    }
}