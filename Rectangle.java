public class Rectangle extends Shape {


    private double width = 1.0 ;
    private double length = 1.0 ;


    public Rectangle(String color, boolean filled , double width , double length) {
        super(color, filled);

        this.length = length;
        this.width = width ;


    }





    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }




    public double getArea(){

        double areaR = width * length ;

        return areaR ;
    }


    public double getPerimeter(){

        double perR = 2 * ( length + width);


        return perR ;

    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }



}
