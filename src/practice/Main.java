package practice;

public class Main {
    public static void main(String[] args) {

        Figure circle = new Circle(3);
        Figure rectangle = new Rectangle(2,4);
        Figure square = new Square(5);

        String [] figuresAreas = {circle.toString(), rectangle.toString(), square.toString()};

                for (String figureArea : figuresAreas) {
                    System.out.println(figureArea);
                }
    }
}
