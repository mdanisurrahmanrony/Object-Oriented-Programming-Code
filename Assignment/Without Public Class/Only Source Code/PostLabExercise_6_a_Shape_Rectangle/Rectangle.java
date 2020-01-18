package PostLabExercise_6_a_Shape_Rectangle;
abstract class Shape {
    protected int location;
    public Shape(int location){
        this.location=location;
    }
    public abstract void display();
}
class Rectangle extends Shape {
    private int height;
    private int width;
    public Rectangle(int location,int height, int width) {
        super(location);
        this.height=height;
        this.width=width;
    }
    public void display(){
        System.out.println("Location: "+location+"\nHeight: "+height+"\nWidth:"+width);
    }
    public static void main(String[] args){
        Rectangle rcl=new Rectangle(150,200,50);
        rcl.display();
    }
}