interface Shape {
    double get`Area();
    double pi = 3.14;
}
class Rectangle implements Shape{
    double height,breadth;

    Rectangle( double height, double breadth){
        this.height = height;
        this.breadth = breadth;
    }

    public double getArea() {
        return height*breadth;
    }
}

class Circle implements Shape{
    double radius;

    Circle( double radius){
        this.radius = radius;
    }

    public double getArea() {
        return pi*radius*radius;
    }
}

class Triangle implements Shape{
    double base, height;

    Triangle( double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5*base*height;
    }
}
