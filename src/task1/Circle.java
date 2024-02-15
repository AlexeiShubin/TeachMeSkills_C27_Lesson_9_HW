package task1;

import task1.BaseFigure;

/**
 * circle class with the "radius" parameter
 */

public final class Circle extends BaseFigure {

    public int radius;

    public Circle(int radius){
        this.figure="circle";
        this.radius=radius;
    }


    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*2*Math.PI;
    }
}
