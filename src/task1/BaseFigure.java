package task1;

/**
 * the shape class combines
 * several classes with different shapes
 * and has the parameters "area" and "perimeter"
 */
public abstract sealed class BaseFigure permits Circle, Rectangle, Triangle {
    public String figure;

    public abstract double area();

    public abstract double perimeter();
}
