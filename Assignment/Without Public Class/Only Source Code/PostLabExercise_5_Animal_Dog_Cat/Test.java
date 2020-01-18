package PostLabExercise_5_Animal_Dog_Cat;
abstract class Animal {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void move();
}
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

class Test {
    public static void main(String[] args){
        Dog dg=new Dog("Lalu","Yellow");
        dg.move();
        Cat ct=new Cat("Gulu","60 Centimetres");
        ct.move();
    }
}