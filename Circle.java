public class Circle extends Shape{


    private double radius = 1.0 ;





    public Circle(String color, boolean filled , double radius) {
        super(color, filled);

        this.radius = radius ;


    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




    public double getArea(){

       double area = 3.14 * (Math.pow(radius ,2 ));
        return area ;
    }

    public double getPerimeter(){

       double pera = 2 * 3.14 * radius ;
        return pera ;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }



}
