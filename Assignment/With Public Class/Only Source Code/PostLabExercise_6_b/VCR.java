package PostLabExercise_6_b;
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