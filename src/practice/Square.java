package practice;

public class Square extends Figure {
    double a;
    Square(double a){
        super("Square");
        this.a = a;
    }
    public String toString (){
        return name+" has area of "+ (String.format("%.2f",(a*2)));
    }
}
