package PostLabExercise_4;
class Food {
    protected String name;
    public Food(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Food name: "+name);
    }
}