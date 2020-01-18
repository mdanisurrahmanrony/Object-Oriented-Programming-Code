package PostLabExercise_6_b;
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
