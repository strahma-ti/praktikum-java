package praktikum5.soal1;

public abstract class Shape {
    protected String shapeName;
    
    public Shape(String name){
        this.shapeName = name;
    }
    
    public abstract double area();
    
    @Override
    public String toString(){
        return this.shapeName;
    }
}
