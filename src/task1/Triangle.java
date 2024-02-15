package task1;

import task1.BaseFigure;

/**
 * triangle class with the "side" and "height" parameters
 */
public final class Triangle extends BaseFigure {

    int side;

    int height;

    public Triangle(int side, int height){
        this.figure="Triangle";
        this.side=side;
        this.height=height;
    }
    @Override
    public double area() {
        return (double) (side * height) / 2;
    }

    @Override
    public double perimeter() {
        int perimeter;
        perimeter=side*3;
        return perimeter;
    }
}
