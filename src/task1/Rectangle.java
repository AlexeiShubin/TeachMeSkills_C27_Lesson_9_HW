package task1;

import task1.BaseFigure;

public final class Rectangle extends BaseFigure {

    /**
     * rectangle class with the "side_a", "side_b" parameters
     */

    int side_a;
    int side_b;

    public Rectangle(int side_a, int side_b){
        this.figure="Rectangle";
        this.side_a=side_a;
        this.side_b=side_b;
    }
    @Override
    public double area() {
        return side_a*side_b;
    }

    @Override
    public double perimeter() {
        return 2*side_a+2*side_b;
    }
}
