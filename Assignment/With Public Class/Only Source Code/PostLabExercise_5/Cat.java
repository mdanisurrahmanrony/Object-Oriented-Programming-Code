package PostLabExercise_5;
class Cat extends Animal {
    private String size;
    public Cat(String name,String size) {
        super(name);
        this.size=size;
    }
    public void move(){
        System.out.println("Cat moves slowly");
    }
}