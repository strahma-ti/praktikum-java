package praktikum5.soal1;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder"); 
        radius = r;
        height = h;
    } 

    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    public String toString(){
        return super.toString() + " of radius " + this.radius + " and height " + this.height;
    }
}
