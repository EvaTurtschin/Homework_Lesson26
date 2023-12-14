package practice;

public class Rectangle extends Figure {
    double a;
    double b;
    Rectangle (double a, double b){
        super("Rectangle");
        this.a = a;
        this.b = b;
    }
    public String toString(){
        return name + " has area of "+(String.format("%.2f",(a * b)));
    }
}
