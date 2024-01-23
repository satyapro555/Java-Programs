
class Main {
    public static void main(String[] args) {
       
        Rectangle r1=new Rectangle(25.5, 60.3);
        System.out.println("AREA OF RECTANGLE : "+ r1.getArea());
        Circle c1=new Circle(25.5);
        System.out.println("AREA OF Circle : "+ c1.getArea());
        Triangle t1=new Triangle(35.5, 65.3);
        System.out.println("AREA OF Triangle : "+ t1.getArea());
    }
}
