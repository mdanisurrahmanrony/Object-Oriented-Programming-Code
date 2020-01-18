package PostLabExercise_4;
class Shingara extends Food{
    private double price;
    private int quality;
    public Shingara(String name,double price, int quality){
        super(name);
        this.price=price;
        this.quality=quality;
    }
    public void display(){
        System.out.println("Name: "+super.name+"\nPrice: "+price+" Tk"+"\nQuality: "+quality);
    }
    public static void main(String args[]){
        Food fd=new Food("Biriyani");   
        fd.display();
        Shingara sr=new Shingara("shomocha",10,100);
        sr.display();
    }
}
