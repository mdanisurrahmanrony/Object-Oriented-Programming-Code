package PostLabExercise_6_b_Vehicle_DVD_VCR_Button;
abstract class Vehicle {
    protected String model;
    public Vehicle(String model){
        this.model=model;
    }
    public abstract void display();
}
class DVD extends Vehicle implements Button{
    private double price;
    public DVD(String model,double price) {
        super(model);
        this.price=price;
    }
    public void display(){
        System.out.println("DVD Model:"+this.model+"\nDVD Price:"+this.price);
    }
    public void play() {
        System.out.println("DVD plays when red button is pressed");
    }
    public void stop() {
        System.out.println("DVD stops when green button is pressed");
    }
    
}
class VCR extends Vehicle implements Button{
    private double price;
    public VCR(String model, double price) {
        super(model);
        this.price=price;
    }
    public void display(){
        System.out.println("Model:"+this.model+"\nVCR Price:"+this.price);
    }
    public void play() {
        System.out.println("VCR plays when right button is pressed");
    }
    public void stop() {
        System.out.println("VCR stops when left button is pressed");
    }    
}
interface Button {
    public void play();
    public void stop();
}

class Main {
    public static void main(String[] args){
        DVD d=new DVD("S1254T",100);
        d.display();
        d.play();
        d.stop();
        VCR v=new VCR("V9574Y",200);
        System.out.print("\nVCR ");
        v.display();
        v.play();
        v.stop();
    }
}
