package practice;

public class Circle extends Figure {
    double r;
    Circle(double r){
        super("Circle");
        this.r = r;
    }
    public String toString(){
        double pi = 3.14;
        return name + " has area of "+ (String.format("%.2f",(pi*(Math.pow(r,2)))));
    }
}
