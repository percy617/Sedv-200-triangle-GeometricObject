/*
            Triangle
-------------------------------
- side1: double
- side2: double
- side3: double
-------------------------------
+ Triangle()
+ Triangle(side1: double, side2: double, side3: double)
+ getSide1(): double
+ getSide2(): double
+ getSide3(): double
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
*/


// GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    /**Default construct*/
    protected GeometricObject() {
    }
    /**Construct a geometric object*/
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    /**Getter method for color*/
    public String getColor() {
    return color;
    }
    /**Setter method for color*/
    public void setColor(String color) {
        this.color = color;
    }
    /**Getter method for filled. Since filled is boolean,
    so, the get method name is isFilled*/
    public boolean isFilled() {
    return filled;
    }
    /**Setter method for filled*/
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /**Abstract method findArea*/
    public abstract double getArea();
    /**Abstract method getPerimeter*/
    public abstract double getPerimeter();
}

// The Triangle class
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    //Default constructor
    public Triangle() 
    {
        this(1.0, 1.0, 1.0);
    }
    // one with sides 1-3
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //returns
    public double getSide1() 
    {
        return side1;
    }
    public double getSide2() {
        return side2;
    }

    public double getSide3() 
    {
        return side3;
    }

    //overrrides for a triangle
    @Override
    public double getArea() 
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    @Override
    public double getPerimeter() 
    {
        return side1 + side2 + side3;
    }

    // toString method
    @Override
    public String toString() 
    {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 +
               ", Color: " + getColor() + ", Filled: " + isFilled();
    }
}